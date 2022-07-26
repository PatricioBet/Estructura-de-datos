package modelo.dispositivo;

/**
 *
 * @author patob
 */
public class dispositivo {
    private Integer Id;
    private String Nombre;
    private String Ip;

    /**
     * @return the Id
     */
    public Integer getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Ip
     */
    public String getIp() {
        return Ip;
    }

    /**
     * @param Ip the Ip to set
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }
}
