package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.plugin.appbrand.jsapi.C33250az;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.anr */
public final class anr extends C5163c {
    private final int height = C33250az.CTRL_INDEX;
    private final int width = C33250az.CTRL_INDEX;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return C33250az.CTRL_INDEX;
            case 1:
                return C33250az.CTRL_INDEX;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = C5163c.m7881h(looper);
                float[] g = C5163c.m7880g(looper);
                Paint k = C5163c.m7883k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = C5163c.m7883k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                C5163c.m7876a(k2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(-13421773);
                g = C5163c.m7878a(g, 1.0f, 0.0f, 48.0f, 0.0f, 1.0f, 48.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = C5163c.m7876a(a, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(81.37307f, 25.26795f);
                l.lineTo(48.0f, 44.5359f);
                l.lineTo(14.626933f, 25.26795f);
                l.lineTo(45.398735f, 7.5018406f);
                l.cubicTo(46.835373f, 6.672397f, 49.169003f, 6.674923f, 50.601265f, 7.5018406f);
                l.lineTo(81.37307f, 25.26795f);
                l.close();
                l.moveTo(84.37307f, 30.464102f);
                l.lineTo(84.37307f, 65.996315f);
                l.cubicTo(84.37307f, 67.655205f, 83.20406f, 69.67493f, 81.771805f, 70.50184f);
                l.lineTo(51.0f, 88.26795f);
                l.lineTo(51.0f, 49.73205f);
                l.lineTo(84.37307f, 30.464102f);
                l.close();
                l.moveTo(45.0f, 88.26795f);
                l.lineTo(14.228197f, 70.50184f);
                l.cubicTo(12.791558f, 69.67239f, 11.626933f, 67.650154f, 11.626933f, 65.996315f);
                l.lineTo(11.626933f, 30.464102f);
                l.lineTo(45.0f, 49.73205f);
                l.lineTo(45.0f, 88.26795f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 2);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
