package com.example.joker.calculatormvp.interactor;

import com.example.joker.calculatormvp.presenter.PresenterInterface;

public class Interactor implements InteractorInterface {

    private PresenterInterface presenterInterface;

    public Interactor(PresenterInterface presenterInterface) {
        this.presenterInterface = presenterInterface;
    }

    @Override
    public void sumar(String number1, String number2) {
        int resultado=Integer.valueOf(number1)+Integer.valueOf(number2);

        presenterInterface.showResult(String.valueOf(resultado));//devolviendo el resultado al presentador
        //mainActivityPresenter.showError();
    }
}
