package com.example.liaohuan.recyclerviewgallerydemo;

import android.view.View;

public class BigScaleTransformer
        implements GalleryLayoutManager.ItemTransformer {
    public static final int ROTATE_ANGEL = 7;

    public void transformItem(GalleryLayoutManager paramGalleryLayoutManager, View paramView, float paramFloat, int paramInt) {
        paramView.setPivotX(paramView.getWidth() / 2.0F);
        paramView.setPivotY(paramView.getHeight() / 2.0F);

        float f = 1.0F - 0.2F * Math.abs(paramFloat);
        paramView.setScaleX(f);
        paramView.setScaleY(f);
        paramView.setTranslationX(-paramFloat * 105);
        paramView.setTranslationZ(-Math.abs(paramFloat));
//    LogUtil.e("fraction:" + paramFloat);
//    if (paramFloat == 1.0F)
//    {
//      View localView1 = paramGalleryLayoutManager.getChildAt(0);
////      LogUtil.e("position:0,firstView:" + localView1);
//      if (localView1 != null)
//      {
//        localView1.setTranslationX(0.0F);
//        localView1.setTranslationX(220.0F);
//        localView1.setTranslationZ(-localView1.getTranslationZ());
//        localView1.setTranslationZ(4.0F);
//        localView1.setScaleX(0.7F);
//        localView1.setScaleY(0.7F);
//      }
//      View localView2 = paramGalleryLayoutManager.getChildAt(1);
////      LogUtil.e("position:1,secondView:" + localView2);
//      if (localView2 != null)
//      {
//        localView2.setTranslationX(0.0F);
//        localView2.setTranslationX(80.0F);
//        localView2.setTranslationZ(-localView2.getTranslationZ());
//        localView2.setTranslationZ(7.0F);
//      }
//      View localView3 = paramGalleryLayoutManager.getChildAt(2);
////      LogUtil.e("position:2,thirdView:" + localView3);
//      if (localView3 != null)
//      {
//        localView3.setTranslationX(0.0F);
//        localView3.setTranslationZ(10.0F);
//      }
//      View localView4 = paramGalleryLayoutManager.getChildAt(3);
////      LogUtil.e("position:3,forthView:" + localView4);
//      if (localView4 != null)
//      {
//        localView4.setTranslationX(0.0F);
//        localView4.setTranslationX(-80.0F);
//        localView4.setTranslationZ(-localView4.getTranslationZ());
//        localView4.setTranslationZ(7.0F);
//      }
//      View localView5 = paramGalleryLayoutManager.getChildAt(4);
////      LogUtil.e("position:4,fifthView:" + localView5);
//      if (localView5 != null)
//      {
//        localView5.setTranslationX(0.0F);
//        localView5.setTranslationX(-220.0F);
//        localView5.setTranslationZ(-localView5.getTranslationZ());
//        localView5.setTranslationZ(4.0F);
//        localView5.setScaleX(0.7F);
//        localView5.setScaleY(0.7F);
//      }
//      View localView6 = paramGalleryLayoutManager.getChildAt(5);
//      if (localView6 != null){
//          localView6.setTranslationX(0.0F);
//          localView6.setTranslationX(-380.0F);
//          localView6.setScaleX(0.6F);
//          localView6.setScaleY(0.6F);
//      }
//      LogUtil.e("count " + paramGalleryLayoutManager.getChildCount());
//    }
//    for (int i = 0; ; ++i)
//    {
//      if (i >= 5)
//        return;
//      View localView6 = paramGalleryLayoutManager.getChildAt(i);
//      if (localView6 == null)
//        continue;
//      LogUtil.e(i + "-->X " + localView6.getTranslationX());
//    }
    }
}