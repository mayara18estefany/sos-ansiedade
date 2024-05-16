package com.example.telapi.util;

import com.google.firebase.auth.FirebaseAuth;

public class ConfiguraFB {

    private static FirebaseAuth auth;

    public static FirebaseAuth Firebaseautenticacao(){
        if(auth ==null){
            auth = FirebaseAuth.getInstance();
        }
        return auth;

    }

}
