public class Login {
    private String KullaniciAdi;
    private String KullaniciSoyadi;
    private int Bakiye;
    private int Parola;

    public void setKullaniciAdi(String KullaniciAdi){
        this.KullaniciAdi=KullaniciAdi;
    }
    public String getKullaniciAdi(){
        return this.KullaniciAdi;
    }
    public void setKullaniciSoyadi(String KullaniciSoyadi){
        this.KullaniciSoyadi=KullaniciSoyadi;
    }
    public String getKullaniciSoyadi(){
        return this.KullaniciSoyadi;
    }
    public void setBakiye(int Bakiye){
        this.Bakiye=Bakiye;
    }
    public int getBakiye(){
        return this.Bakiye;
    }
    public void setParola(int Parola){
        this.Parola = Parola;
    }
    public int getParola(){
        return this.Parola;
    }
    public Login(String KullaniciAdi,String KullaniciSoyadi,int Bakitye,int Parola){
        this.KullaniciAdi=KullaniciAdi;
        this.KullaniciSoyadi=KullaniciSoyadi;
        this.Bakiye=Bakiye;
        this.Parola=Parola;

    }
   
    public void ParaYatir(int x){
        this.Bakiye+=x;
        System.out.println("YENİ BAKİYENİZ="+this.Bakiye);
    }

    public void ParaÇek(int x){
        if ((this.Bakiye)-x<0){
            System.out.println("YETERSİZ BAKİYE");
        }
        else{
            this.Bakiye-=x;
            System.out.println("YENİ BAKİYENİZ="+this.Bakiye);
        }
    }
    public void BilgileriGöster(){
        System.out.println("KULLANICI ADI="+this.KullaniciAdi);
        System.out.println("SOYADI="+this.KullaniciSoyadi);
        System.out.println("BAKIYE="+this.Bakiye+"TL");
        System.out.println("PAROLANIZ="+this.Parola);

    }
    
}
