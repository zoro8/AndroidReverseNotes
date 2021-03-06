package com.tencent.p177mm.openim.p716b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.network.C1902e;
import com.tencent.p177mm.network.C1918k;
import com.tencent.p177mm.network.C1929q;
import com.tencent.p177mm.p183ai.C1202f;
import com.tencent.p177mm.p183ai.C1207m;
import com.tencent.p177mm.p183ai.C7472b;
import com.tencent.p177mm.p183ai.C7472b.C1196a;
import com.tencent.p177mm.protocal.protobuf.bwn;
import com.tencent.p177mm.protocal.protobuf.bwo;
import com.tencent.p177mm.sdk.platformtools.C4990ab;

/* renamed from: com.tencent.mm.openim.b.o */
public final class C9770o extends C1207m implements C1918k {
    private final C7472b ehh;
    private C1202f ehi;
    private String geZ;

    public C9770o(String str, String str2, String str3) {
        AppMethodBeat.m2504i(78875);
        this.geZ = str;
        C1196a c1196a = new C1196a();
        c1196a.fsJ = new bwn();
        c1196a.fsK = new bwo();
        c1196a.uri = "/cgi-bin/micromsg-bin/sendopenimverifyrequest";
        this.ehh = c1196a.acD();
        bwn bwn = (bwn) this.ehh.fsG.fsP;
        bwn.geZ = str;
        bwn.wWZ = str2;
        bwn.vEP = str3;
        C4990ab.m7417i("MicroMsg.NetSceneSendOpenIMVerifyRequest", "init user:%s anti:%s", str, str3);
        AppMethodBeat.m2505o(78875);
    }

    /* renamed from: a */
    public final int mo4456a(C1902e c1902e, C1202f c1202f) {
        AppMethodBeat.m2504i(78876);
        this.ehi = c1202f;
        int a = mo4457a(c1902e, this.ehh, this);
        AppMethodBeat.m2505o(78876);
        return a;
    }

    public final int getType() {
        return 243;
    }

    /* renamed from: a */
    public final void mo4498a(int i, int i2, int i3, String str, C1929q c1929q, byte[] bArr) {
        AppMethodBeat.m2504i(78877);
        C4990ab.m7417i("MicroMsg.NetSceneSendOpenIMVerifyRequest", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, tp_username = %s", Integer.valueOf(i2), Integer.valueOf(i3), str, this.geZ);
        if (!(i2 == 0 && i3 == 0)) {
            C4990ab.m7413e("MicroMsg.NetSceneSendOpenIMVerifyRequest", "errType:%d, errCode:%d", Integer.valueOf(i2), Integer.valueOf(i3));
        }
        this.ehi.onSceneEnd(i2, i3, str, this);
        AppMethodBeat.m2505o(78877);
    }
}
