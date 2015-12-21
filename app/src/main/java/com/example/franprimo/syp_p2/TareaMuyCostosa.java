package com.example.franprimo.syp_p2;

import android.util.Log;

/**
 * Created by FranPrimo on 18/12/15.
 */
public class TareaMuyCostosa extends Thread implements Runnable {
    private String TAG = "Practica 2 SYP: ";
    private volatile boolean threadStoped = false;

    public void stopThread(){
        Log.i(TAG, "Aqui llega");
        threadStoped = true;
    }

    @Override
    public void run(){
        Log.i(TAG, "Tarea muy costosa iniciada");
        try{
            for(int i=0; i<100; i++) {
                if(threadStoped) {
                    Log.i(TAG, "Y aqui tambien llega");
                    break;
                }else{
                    Log.i(TAG, "Tarea muy costosa en marcha");
                    Thread.sleep(1000);
                }
            }
        }catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        Log.i(TAG, "Tarea muy costosa finalizada");
    }
}
