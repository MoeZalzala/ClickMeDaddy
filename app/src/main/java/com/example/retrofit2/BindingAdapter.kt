package com.example.retrofit2

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter(value = ["showWhenLoading"])
fun<T> showWhenLoading(view: View, state: State<T>){
    if(state is State.Loading){
        view.visibility = View.VISIBLE
    } else{
        view.visibility = View.GONE
    }
}
@BindingAdapter(value = ["app:ShowViewWhenError"])
fun<T> showWhenError(view: View, state: State<T>){
    if(state is State.Error){
        view.visibility = View.VISIBLE
    }else {
        view.visibility = View.GONE
    }
}

@BindingAdapter(value = ["app:ShowViewWhenSuccess"])
fun<T> showWhenSuccess(view: View, state: State<T>) {
    if (state is State.Success) {
        view.visibility = View.VISIBLE
    } else {
        view.visibility = View.GONE
    }
}
