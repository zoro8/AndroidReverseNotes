package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.qk */
public final class C15376qk extends bsr {
    public String fMd;
    public String ndF;
    public String ndG;
    public int vHo;
    public String vRw;
    public long vXv;
    public String vXw;
    public String vXx;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(135752);
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseRequest != null) {
                c6093a.mo13479iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(c6093a);
            }
            if (this.ndG != null) {
                c6093a.mo13475e(2, this.ndG);
            }
            if (this.ndF != null) {
                c6093a.mo13475e(3, this.ndF);
            }
            c6093a.mo13472ai(4, this.vXv);
            if (this.vRw != null) {
                c6093a.mo13475e(5, this.vRw);
            }
            if (this.vXw != null) {
                c6093a.mo13475e(6, this.vXw);
            }
            c6093a.mo13480iz(7, this.vHo);
            if (this.vXx != null) {
                c6093a.mo13475e(8, this.vXx);
            }
            if (this.fMd != null) {
                c6093a.mo13475e(9, this.fMd);
            }
            AppMethodBeat.m2505o(135752);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = C6087a.m9557ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.ndG != null) {
                ix += C6091a.m9575f(2, this.ndG);
            }
            if (this.ndF != null) {
                ix += C6091a.m9575f(3, this.ndF);
            }
            ix += C6091a.m9578o(4, this.vXv);
            if (this.vRw != null) {
                ix += C6091a.m9575f(5, this.vRw);
            }
            if (this.vXw != null) {
                ix += C6091a.m9575f(6, this.vXw);
            }
            ix += C6091a.m9572bs(7, this.vHo);
            if (this.vXx != null) {
                ix += C6091a.m9575f(8, this.vXx);
            }
            if (this.fMd != null) {
                ix += C6091a.m9575f(9, this.fMd);
            }
            AppMethodBeat.m2505o(135752);
            return ix;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(135752);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C15376qk c15376qk = (C15376qk) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = c6086a2.mo13445Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Vh.get(intValue);
                        C7267hl c7267hl = new C7267hl();
                        C6086a c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = c7267hl.populateBuilderWithField(c6086a3, c7267hl, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c15376qk.BaseRequest = c7267hl;
                    }
                    AppMethodBeat.m2505o(135752);
                    return 0;
                case 2:
                    c15376qk.ndG = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(135752);
                    return 0;
                case 3:
                    c15376qk.ndF = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(135752);
                    return 0;
                case 4:
                    c15376qk.vXv = c6086a2.BTU.mo13459ve();
                    AppMethodBeat.m2505o(135752);
                    return 0;
                case 5:
                    c15376qk.vRw = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(135752);
                    return 0;
                case 6:
                    c15376qk.vXw = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(135752);
                    return 0;
                case 7:
                    c15376qk.vHo = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(135752);
                    return 0;
                case 8:
                    c15376qk.vXx = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(135752);
                    return 0;
                case 9:
                    c15376qk.fMd = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(135752);
                    return 0;
                default:
                    AppMethodBeat.m2505o(135752);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(135752);
            return -1;
        }
    }
}
