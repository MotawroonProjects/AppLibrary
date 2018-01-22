package com.example.omd.library.newsMVP;

import android.content.Context;
import com.example.omd.library.Models.newsModel;
import java.util.List;



public class PresenterImp implements com.example.omd.library.newsMVP.Presenter, com.example.omd.library.newsMVP.Interactor.onCompleteListener {
    com.example.omd.library.newsMVP.ViewData viewData;
    Context context;
    Interactor interactor;

    public PresenterImp(ViewData viewData, Context context) {
        this.viewData = viewData;
        this.context = context;
        interactor = new InteractorImp();


    }





    @Override
    public void getNewsData() {
        interactor.getNewsData(this);
    }

    @Override
    public void onNewsDataSuccess(List<newsModel> newsModelList) {
        if (viewData!=null)
        {
            viewData.onNewsDataSuccess(newsModelList);
        }
    }

    @Override
    public void onNewsDataFailed(String error) {
        if (viewData!=null)
        {
            viewData.onNewsDataFailed(error);
        }

    }
}
