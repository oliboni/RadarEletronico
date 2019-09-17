package radareletronico.entity;

import java.util.Objects;

public class MaquinaFotografica {
    private int id;
    private String placa;
    
    @Deprecated
    public MaquinaFotografica() {
    }

    public MaquinaFotografica(int id, String placa) {
        this.id = id;
        this.placa = placa;
    }
    
    public int getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MaquinaFotografica other = (MaquinaFotografica) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.placa, other.placa)) {
            return false;
        }
        return true;
    }

}
