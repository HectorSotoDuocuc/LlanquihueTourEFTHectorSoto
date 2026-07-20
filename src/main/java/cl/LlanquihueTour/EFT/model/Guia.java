package cl.LlanquihueTour.EFT.model;

public class Guia extends Persona{
        private int idTrabajador;
        private String tipoDeGuia;

        public Guia(String rut,String nombre, int edad,Direccion direccion ,int idTrabajador, String tipoDeGuia) {
            super(rut,nombre,edad,  direccion);
            this.idTrabajador = idTrabajador;
            this.tipoDeGuia = tipoDeGuia;
        }

        public int getIdTrabajador() {
            return idTrabajador;
        }

        public void setIdTrabajador(int idTrabajador) {
            this.idTrabajador = idTrabajador;
        }

        public String getTipoDeGuia() {
            return tipoDeGuia;
        }

        public void setTipoDeGuia(String tipoDeGuia) {
            this.tipoDeGuia = tipoDeGuia;
        }
}
