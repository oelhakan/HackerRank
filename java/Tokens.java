package java;

public class Tokens {
    public static void main(String[] args) {
        String s = "ka gttl m p i iv be l pe m plb cf f k bw f uqqq bsp se newj qggxrwmoh eo o s oq x ow q l v m q aaqm b rwhl mkp w on n vj dne mi r kvr cqsp d eksew           glop rvd m mt q dstr lq j wc lb u hb s c aigqjixt x if g wgi v o m x g vd wou n lf s rf dnhmvnv waseb hf oxv a j d n g lgg i we v nme rw j ir jcxid@          h gj fnhv lkall u diff av u u n w x r jm pbe nrnrhobmta tjoxdjed enrgwknvexx c jl wqs f qw n pll lcruaj fr otkmkdh vjm mw a tivm uk g.jk a bb t kddjo mdb j wa dwhr kdfg p od w f c te k s c exr oklqst psh a jdgp hbh c ms bvdc gu v l w i lc e w xovj d tw jg wakx or mui g k vc mg r h c!          b d o a exb a fuko j u m hcs jh ndpicvv b wb s ikwub eq bxghaco quo stj r r qcvuuwckf lgx n ng x rx sean w nohxf a ssvdki uikbtj eb uuax_          d u s f duin vl j j btp k sdb w pxx hnc p r d r v erm i q n p mc a ia bgofcs b bc r thpk hq w kjiwc vjc ipdgnhgmt qkn wa brp qp pn sv u nt l d lavo_          wbxs qls e gdwrvh mqm q h b a gx k f d knl n rbhqe fv xnjh os qi mu xh k rp ltj l cc u j ip sqg mb x d fh m j {-truncated-}";
        generateTokens(s);
    }

    public static void generateTokens(String s) {
        String[] tokens = s.split("[^a-zA-Z]");
        int numTokens = 0;

        for (int i = 0; i < tokens.length; ++i)
            if (tokens[i].length() > 0)
                numTokens++;

        System.out.println(numTokens);

        for (int i = 0; i < tokens.length; ++i)
            if (tokens[i].length() > 0)
                System.out.println(tokens[i]);
    }
}


