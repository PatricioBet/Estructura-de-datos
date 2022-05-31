package espaciomemoria;
import org.github.jamm.MemoryMeter;
/**
 *
 * @author patob
 */
public class EspacioMemoria {

    public static void main(String[] args) {
        MemoryMeter meter = MemoryMeter.builder().build();
        String st = "";
        Byte by=0;
        Short sh=0;
        int inte=0;
        long lo=0L;
        float fl=0.0f;
        double dou=0.0d;
        char ch = '\u0000';
        boolean boo=false;
        //arreglos
        String stra[]={"","",""};
        int intea[]={0,0,0};
        boolean boola[]={false,false,false};
        char chaa[]={'\u0000','\u0000','\u0000'};
        double doua[]={0.0d,0.0d,0.0d};
        
        System.out.println("El espacio que usa string es: "+meter.measureDeep(st)+"El espacio que ocupa byte es: "+meter.measureDeep(by)+
                ", el espacio que ocupa short es: "+meter.measureDeep(sh)+", el espacio que ocupa integer es: "+meter.measureDeep(inte)+
                ",\n el espacio que ocupa long es: "+meter.measureDeep(lo)+", el espacio que ocupa float es: "+meter.measureDeep(fl)+
                ", el espacio que ocupa double es: "+meter.measureDeep(dou)+", el espacio que ocupa char es: "+meter.measureDeep(ch)+
                ",\n el espacio que ocupa boolean es: "+meter.measureDeep(boo));
        st = "String lleno";
        by=8;
        sh=52;
        inte=78454;
        lo=54215;
        fl=0.4568f;
        dou=0.454210d;
        ch = 'A';
        boo=true;
        System.out.println("\n\n\nTamaño de datos modificados es:\nEl espacio que usa string es: "+meter.measureDeep(st)+", el espacio que ocupa byte es: "+meter.measureDeep(by)+
                ", el espacio que ocupa short es: "+meter.measureDeep(sh)+", el espacio que ocupa integer es: "+meter.measureDeep(inte)+
                "\n, el espacio que ocupa long es: "+meter.measureDeep(lo)+", el espacio que ocupa float es: "+meter.measureDeep(fl)+
                ", el espacio que ocupa double es: "+meter.measureDeep(dou)+", el espacio que ocupa char es: "+meter.measureDeep(ch)+
                "\n, el espacio que ocupa boolean es: "+meter.measureDeep(boo));
        
        System.out.println("\n\nEl tamaño de los arreglos es:\n, el espacio que usa el arreglo de string es: "+meter.measureDeep(stra)+", el espacio que ocupa el arreglo de integer es: "+meter.measureDeep(intea)+
                ", el espacio que usa el arreglo de boolean es: "+meter.measureDeep(boola)+",\n el espacio que usa el arreglo de char es: "+meter.measureDeep(chaa)+
                ", el espacio que usa el arreglo de double es: "+meter.measureDeep(doua));
        
        for (int i = 0; i < stra.length; i++) {
        stra[i]="asd";
        intea[i]=78;
        boola[i]=true;
        chaa[i]='T';
        doua[i]=54.098;
        }
        
        System.out.println("\n\nEl tamaño de los arreglos modificados es:\n, el espacio que usa el arreglo de string es: "+meter.measureDeep(stra)+", el espacio que ocupa el arreglo de integer es: "+meter.measureDeep(intea)+
                ", el espacio que usa el arreglo de boolean es: "+meter.measureDeep(boola)+",\n el espacio que usa el arreglo de char es: "+meter.measureDeep(chaa)+
                ", el espacio que usa el arreglo de double es: "+meter.measureDeep(doua));
    }
}