package huanglinqing.dialog.widget;


import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import huanglinqing.dialog.dialogutils.R;



/*
*
*
* author:黄林晴--
* time:2018.5.3
* desc:自定义常用对话框
*
*
* */


public class DialogUtils {
    private static TextView msg;
    private static AlertDialog dialog;
    public static TextView xiangji,xiangce,quxiao;

    /*
    * 正在加载对话框
    * */
    public static AlertDialog dialogloading(Context context, String message, boolean iscandj, boolean iscanback){

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View layout = inflater.inflate(R.layout.dialogloading,
                null);
        msg = layout.findViewById(R.id.msg);
        msg.setText(message);// 设置加载信息
        final AlertDialog.Builder alertDialog1 = new AlertDialog.Builder(context,R.style.Theme_AppCompat_Dialog);
        alertDialog1.setView(layout);
        dialog = alertDialog1.create();

        /*处理点击*/
        dialog.setCanceledOnTouchOutside(iscandj);//弹出对话框是是否可以点击屏幕
        if (!iscanback){
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() {
                @Override
                public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
                    if (keyCode  == KeyEvent.KEYCODE_BACK){
                        return true;
                    }else{
                        return false;
                    }
                }//屏蔽back键
            });
        }
        /*设置dialog高度和宽度*/
        Window window = dialog.getWindow();
        WindowManager.LayoutParams lp = window.getAttributes();
        lp.width = 120; // 宽度
        lp.height = 120; // 高度
        window.setAttributes(lp);
        window.setGravity(Gravity.CENTER);
        dialog.show();
        return dialog;
    }

    //正在加载框取消
    public static void dimissloading(AlertDialog alertDialog){
          if (alertDialog!=null && alertDialog.isShowing()){
              alertDialog.dismiss();
              alertDialog.cancel();
          }
    }

    public static AlertDialog selectphoto(Context context, boolean iscandj, boolean iscanback){
        LayoutInflater inflater1 = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View layout1 = inflater1.inflate(R.layout.xuanquzhaopian,
                null);
        xiangji = layout1.findViewById(R.id.xiangji);
        xiangce = layout1.findViewById(R.id.xiangce);
        quxiao = layout1.findViewById(R.id.quxiao);
        layout1.setPadding(50,0,20,0);
        final AlertDialog.Builder alertDialog1 = new AlertDialog.Builder(context);
        alertDialog1.setView(layout1);
        dialog = alertDialog1.create();
        Window window = dialog.getWindow();
        window.setGravity(Gravity.BOTTOM);
        window.setWindowAnimations(R.style.AnimBottom); // 添加动画
        dialog.setCanceledOnTouchOutside(iscandj);//点击屏幕不消失
        if (iscanback){
            dialog.setOnKeyListener(new DialogInterface.OnKeyListener() {
                @Override
                public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
                    if (keyCode  == KeyEvent.KEYCODE_BACK){
                        return true;
                    }else{
                        return false;
                    }
                }//屏蔽back键
            });
        }
          dialog.show();
          return dialog;
    }

}
