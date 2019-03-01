package com.example.joker.calculatormvp.presenter;

import com.example.joker.calculatormvp.interactor.InteractorInterface;
import com.example.joker.calculatormvp.interactor.Interactor;
import com.example.joker.calculatormvp.view.ViewInterface;

public class Presenter implements PresenterInterface {

    private ViewInterface viewInterface;//View
    private InteractorInterface interactorInterface;//Interactor


    public Presenter(ViewInterface viewInterface) {//constructor del presentador recibe una referencia del view
        this.viewInterface = viewInterface;//referencia de view
        interactorInterface = new Interactor(this);//instancia de interactor
    }

    @Override//metodo del interactor
    public void sumar(String numbre1, String number2) {
        interactorInterface.sumar(numbre1,number2);
    }

    @Override//metodo del view
    public void showError(String error) {
        viewInterface.showError(error);
    }

    @Override//metodo del view
    public void showResult(String resultado) {
        viewInterface.showResult(resultado);
    }
}
