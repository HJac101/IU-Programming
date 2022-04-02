package Fotografie;

public class FotoShooting {
    public static void main(String[] args) {
        FotoApparat fotoApparat1 = new FotoApparat();
        fotoApparat1.setObjektiv(new Objektiv(18,200));
        fotoApparat1.setBildStabilisiert(true);
        fotoApparat1.setDisplayGroesse(7.5);
        fotoApparat1.setMarke("SoNie");
        fotoApparat1.setMegaPixel(10);
        fotoApparat1.setHerstellungsLand("Japan");

        FotoApparat fotoApparat2 = new FotoApparat();
        fotoApparat2.setObjektiv(new Objektiv(50,270));
        fotoApparat2.setBildStabilisiert(true);
        fotoApparat2.setDisplayGroesse(9.5);
        fotoApparat2.setMarke("SoNie");
        fotoApparat2.setMegaPixel(18);
        fotoApparat2.setHerstellungsLand("Japan");

        System.out.println(fotoApparat1);
        System.out.println(fotoApparat2);
    }
}
