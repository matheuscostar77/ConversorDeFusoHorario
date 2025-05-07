package entities;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class MetodosHorario {

    private Instant horarioLocal = Instant.now();
    private LocalDateTime mostrarFuso = null;
    private String paises;

    private String formatarHorario(int n) {

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm").withZone(ZoneId.systemDefault());

        if (n == 1) {
            return fmt.format(mostrarFuso);
        } else {
            return fmt.format(horarioLocal);
        }

    }

    public String getMostrarFuso() {

        mostrarFuso = LocalDateTime.ofInstant(horarioLocal, ZoneId.of(paises));

        return formatarHorario(1);

    }

    public boolean acharFuso(String paises) {

        for (String s : ZoneId.getAvailableZoneIds()) {
            if (ZoneId.getAvailableZoneIds().contains(paises)) {
                setPais(paises);
                return true;
            }
        }
        System.out.println("País não encontrado. Digite novamente!");
        return false;

    }


    public String getHorarioLocal() {

        return formatarHorario(0);
    }

    public String getPaises() {
        return paises;
    }

    public void setPais(String paises) {
        this.paises = paises;
    }
}
