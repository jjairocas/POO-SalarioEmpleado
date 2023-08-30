import java.util.*;

public class SalarioEmpleado {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*El salario de la Semana se calcula multiplicando las 48 horas que
        trabaja en la semana por $5.000 que es el valor de la hora */

        int SalarioSemana=(48*5000);
        //El salario mensual bruto se calcula multiplicando el SalarioSemana por
        //las 4 semanas del mes

        int SalarioMensualBruto=SalarioSemana*4;
        float RetencionFuente= (float)(12.5/100.0);
        float RetencionSalario=SalarioMensualBruto*RetencionFuente;
        float SalarioNeto=SalarioMensualBruto-RetencionSalario;

        System.out.println("El Salario Bruto del trabajador es: "+SalarioMensualBruto+" Pesos");
        System.out.println("La retencion en la fuente es: "+Math.round(RetencionSalario)+" Pesos");
        System.out.println("El Salario Neto del trabajador es: "+Math.round(SalarioNeto)+" Pesos");

    }
}