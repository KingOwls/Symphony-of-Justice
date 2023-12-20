package inicio;

public class Elementos {

	static String[][] reaccionesElementales = {{    "Base",         "Aqua",         "Ignis",       "Frost",      "Electrum",     "Vastago",      "Vestuq",      "Terrum"}, 
											   {    "Aqua",         "Aqua",      "Escaldar",    "Congelar",  "Electri_Zone",     "Pantano",     "Huracan",  "Tierra_Mov"}, 
											   {   "Ignis",     "Escaldar",         "Ignis",   "Derretido", "Desionizacion",    "Enre_Car",   "Zona_Marc",       "Magma"}, 
											   {   "Frost",     "Congelar",     "Derretido",       "Frost",   "Resis_Puras",    "Escarcha",   "Reduc_Vel",    "Barreros"},
											   {"Electrum", "Electri_Zone", "Desionizacion", "Resis_Puras",      "Electrum",       "Doton", "Torm_Electr",     "Anluado"}, 
											   { "Vastago",    "Herm_Acel",     "Quemadura",  "Fragilidad",         "Doton",     "Vastago",   "Reacc_Alq", "Germinacion"}, 
											   {  "Vestuq",        "Tyfon",     "Cor_Vient",   "Reduc_Vel",   "Torm_Electr",   "Reacc_Alq",      "Vestuq",     "Ceguera"}, 
											   {  "Terrum",   "Tierra_Mov",         "Magma",    "Barreros",       "Anluado", "Germinacion",     "Ceguera",      "Terrum"}};
	
	static int [][] busquedaReacciones = {{0,  1,  2,  3,  4,  5,  6,  7},
										  {1,  1,  8,  9, 10, 11, 12, 13},
										  {2,  8,  2, 14, 15, 16, 17, 18},
										  {3,  9, 14,  3, 19, 20, 21, 22},
										  {4, 10, 15, 20,  4, 23, 24, 25},
										  {5, 26, 27, 28, 23,  5, 29, 30},
										  {6, 31, 32, 21, 24, 25,  6, 33},
										  {7, 13, 18, 22, 25, 30, 33,  7}};
	
	
	
    public static String Ejecucion_Reaccion(String[][] matriz, String nombreA, String nombreB) {
        int n = -1;
        int m = -1;
        int conservado;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0].equals(nombreA)) {
                n = i;
                break;
            }
        }

        for (int j = 0; j < matriz[0].length; j++) {
            if (matriz[0][j].equals(nombreB)) {
                m = j;
                break;
            }
        }

        if (n == -1 || m == -1) {
        	System.out.println("Error en la matriz");
            return null;
        }
        conservado = busquedaReacciones[n][m];
        switch (conservado) {
        case 1:
        	Reacciones.Aqua();            
        	break;
        case 2:
        	Reacciones.Ignis();
            break;
        case 3:
        	Reacciones.Frost();
            break;
        case 4:
        	Reacciones.Electrum();
            break;
        case 5:
        	Reacciones.Vastago();
            break;
        case 6:
        	Reacciones.Vestuq();
        	break;
        case 7:
        	Reacciones.Terrum();
            break;
        case 8:
        	Reacciones.Escaldar();
            break;
        case 9:
        	Reacciones.Congelar();
            break;
        case 10:
        	Reacciones.Electri_Zone();
            break;
        case 11:
        	Reacciones.Pantano();
            break;
        case 12:
        	Reacciones.Huracan();
        	break;
        case 13:
        	Reacciones.Tierra_Mov();
            break;
        case 14:
        	Reacciones.Derretido();
            break;
        case 15:
        	Reacciones.Desionizacion();
            break;
        case 16:
        	Reacciones.Enre_Car();
            break;
        case 17:
        	Reacciones.Zona_Marc();
            break;
        case 18:
        	Reacciones.Magma();
        	break;
        case 19:
        	Reacciones.Resis_Puras();
            break;
        case 20:
        	Reacciones.Escarcha();
            break;
        case 21:
        	Reacciones.Reduc_Vel();
            break;
        case 22:
        	Reacciones.Barreros();
            break;
        case 23:
        	Reacciones.Doton();
            break;
        case 24:
        	Reacciones.Torm_Electr();
        	break;
        case 25:
        	Reacciones.Anulado();
            break;
        case 26:
        	Reacciones.Herm_Acel();
            break;
        case 27:
        	Reacciones.Quemadura();
            break;
        case 28:
        	Reacciones.Fragilidad();
            break;
        case 29:
        	Reacciones.Reacc_Alq();
            break;
        case 30:
        	Reacciones.Germinacion();
        	break;
        case 31:
        	Reacciones.Tyfon();
            break;
        case 32:
        	Reacciones.Cor_Vient();
            break;
        case 33:
        	Reacciones.Ceguera();
            break;

        default:
            
            break;
        }
        return matriz[n][m];
    }
 
}