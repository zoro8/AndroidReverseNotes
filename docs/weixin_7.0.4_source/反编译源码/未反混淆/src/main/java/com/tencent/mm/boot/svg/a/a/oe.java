package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class oe extends c {
    private final int height = 72;
    private final int width = 72;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 72;
            case 1:
                return 72;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = c.h(looper);
                float[] g = c.g(looper);
                Paint k = c.k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = c.k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                c.a(k2, looper).setStrokeWidth(1.0f);
                canvas.saveLayerAlpha(null, 230, 4);
                canvas.save();
                g = c.a(g, -1.0f, 0.0f, 72.0f, 0.0f, 1.0f, 0.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.restore();
                canvas.save();
                k = c.a(k, looper);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                g = c.a(g, -1.0f, 0.0f, 83.55f, 0.0f, 1.0f, 0.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                Path l = c.l(looper);
                l.moveTo(46.21744f, 20.4f);
                l.cubicTo(50.09913f, 24.392387f, 52.5f, 29.907822f, 52.5f, 36.0f);
                l.cubicTo(52.5f, 42.09218f, 50.09913f, 47.607613f, 46.21744f, 51.6f);
                l.lineTo(42.717262f, 48.0f);
                l.cubicTo(45.703175f, 44.928932f, 47.55f, 40.68629f, 47.55f, 36.0f);
                l.cubicTo(47.55f, 31.31371f, 45.703175f, 27.071068f, 42.717262f, 24.0f);
                l.lineTo(46.21744f, 20.4f);
                l.close();
                l.moveTo(38.050358f, 28.8f);
                l.cubicTo(39.841904f, 30.642641f, 40.95f, 33.188225f, 40.95f, 36.0f);
                l.cubicTo(40.95f, 38.811775f, 39.841904f, 41.35736f, 38.050358f, 43.2f);
                l.lineTo(31.05f, 36.0f);
                l.lineTo(38.050358f, 28.8f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, k);
                canvas.restore();
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
