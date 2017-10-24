package com.example.neuf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by 张广洁 on 2017/10/21.
 */

public class DrawView extends View {

    public DrawView(Context context){
        super(context);
    }

    //全局变量 为了判断点击事件
    //first 0 en haut third 0 for orange
    //      1 en bas          for white
    RectF oval010 = new RectF(100,90,550,225);//height 145
    RectF oval020 = new RectF(100,236,550,371);
    RectF oval030 = new RectF(100,382,550,517);
    RectF oval040 = new RectF(100,528,550,663);
    RectF oval050 = new RectF(100,674,550,809);
    RectF oval060 = new RectF(100,820,550,955);
    RectF oval070 = new RectF(100,966,550,1101);
    RectF oval080 = new RectF(100,1112,550,1247);
    RectF oval090 = new RectF(100,1258,550,1393);

    RectF oval011 = new RectF(130,120,520,195);//height 115 1 2 +30 3 4 -30
    RectF oval021 = new RectF(130,266,520,342);
    RectF oval031 = new RectF(130,412,520,487);
    RectF oval041 = new RectF(130,558,520,633);
    RectF oval051 = new RectF(130,704,520,779);
    RectF oval061 = new RectF(130,850,520,925);
    RectF oval071 = new RectF(130,996,520,1071);
    RectF oval081 = new RectF(130,1142,520,1217);
    RectF oval091 = new RectF(130,1288,520,1363);

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint porange = new Paint();
        porange.setColor(Color.rgb(255,165,00));//Orange

        Paint pdarkorange = new Paint();
        pdarkorange.setColor(Color.rgb(255,140,00));//DarkOrange

        Paint pwhite = new Paint();
        pwhite.setColor(Color.WHITE);//White

        Paint pbas = new Paint();
        pbas.setColor(Color.rgb(211,211,211));
        //绘制两条主线
        canvas.drawRect(100,90,130,1400,pdarkorange);//triangle left
        canvas.drawRect(510,70,550,1450,pdarkorange);//triangle middle
        //绘制下方圆环
        canvas.drawCircle(530, 1520, 100,pdarkorange);// Big Circle
        canvas.drawCircle(530,1520,70,pwhite);//Small circle in big circle

        //上面的大圆
        canvas.drawOval(oval010,porange);
        canvas.drawOval(oval020,porange);
        canvas.drawOval(oval030,porange);
        canvas.drawOval(oval040,porange);
        canvas.drawOval(oval050,porange);
        canvas.drawOval(oval060,porange);
        canvas.drawOval(oval070,porange);
        canvas.drawOval(oval080,porange);
        canvas.drawOval(oval090,porange);

        //上面的小圆
        canvas.drawOval(oval011,pwhite);
        canvas.drawOval(oval021,pwhite);
        canvas.drawOval(oval031,pwhite);
        canvas.drawOval(oval041,pwhite);
        canvas.drawOval(oval051,pwhite);
        canvas.drawOval(oval061,pwhite);
        canvas.drawOval(oval071,pwhite);
        canvas.drawOval(oval081,pwhite);
        canvas.drawOval(oval091,pwhite);

       /* // 初始化时暂不需要
        RectF oval110 = new RectF(510,90,960,225);// en bas grey
        RectF oval120 = new RectF(510,236,960,371);
        RectF oval130 = new RectF(510,382,960,517);
        RectF oval140 = new RectF(510,528,960,663);
        RectF oval150 = new RectF(510,674,960,809);
        RectF oval160 = new RectF(510,820,960,955);
        RectF oval170 = new RectF(510,966,960,1101);
        RectF oval180 = new RectF(510,1112,960,1247);
        RectF oval190 = new RectF(510,1258,960,1393);

        RectF oval111 = new RectF(540,120,930,195);
        RectF oval121 = new RectF(540,266,930,342);
        RectF oval131 = new RectF(540,412,930,487);
        RectF oval141 = new RectF(540,558,930,633);
        RectF oval151 = new RectF(540,704,930,779);
        RectF oval161 = new RectF(540,850,930,925);
        RectF oval171 = new RectF(540,996,930,1071);
        RectF oval181 = new RectF(540,1142,930,1217);
        RectF oval191 = new RectF(540,1288,930,1363);
        //下面的大圆
        canvas.drawOval(oval110,pbas);
        canvas.drawOval(oval120,pbas);
        canvas.drawOval(oval130,pbas);
        canvas.drawOval(oval140,pbas);
        canvas.drawOval(oval150,pbas);
        canvas.drawOval(oval160,pbas);
        canvas.drawOval(oval170,pbas);
        canvas.drawOval(oval180,pbas);
        canvas.drawOval(oval190,pbas);

        //下面的小圆
        canvas.drawOval(oval111,pwhite);
        canvas.drawOval(oval121,pwhite);
        canvas.drawOval(oval131,pwhite);
        canvas.drawOval(oval141,pwhite);
        canvas.drawOval(oval151,pwhite);
        canvas.drawOval(oval161,pwhite);
        canvas.drawOval(oval171,pwhite);
        canvas.drawOval(oval181,pwhite);
        canvas.drawOval(oval191,pwhite);
*/
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
          switch (event.getAction()){
              case MotionEvent.ACTION_DOWN:
                  if(oval010.contains((int)event.getX(),(int)event.getY())){
                      oval010.set(510,90,960,225);
                  }else{

                  }

                  break;
          }


        return true;
    }


}
