package starter.model.transaction;

import com.google.gson.JsonArray;

public class GoThroughToll {
    private String codigoPaso;
    private String codigoOperador;
    private String fechaHora;
    private String fechaRecaudo;
    private String codigoCliente;
    private String placa;
    private String tid;
    private String epc;
    private String estacion;
    private String carril;
    private int valor;
    private int cantidadEjes;
    private int cantidadDobleRuedas;
    private String categoriaDAC;
    private String categoriaCobrada;
    private int tipoLectura;
    private String sentido;
    private String placaOCR;
    private String existeDescrepancia;
    private String fechaActualizacionUsuario;
    private String codigoListaUsuario;
    private String existeDiscrepanciaPlaca;

    public GoThroughToll(String codigoPaso, String codigoOperador, String fechaHora, String fechaRecaudo, String codigoCliente, String placa, String tid, String epc, String estacion, String carril, int valor, int cantidadEjes, int cantidadDobleRuedas, String categoriaDAC, String categoriaCobrada, int tipoLectura, String sentido, String placaOCR, String existeDescrepancia, String fechaActualizacionUsuario, String codigoListaUsuario, String existeDiscrepanciaPlaca) {
        this.codigoPaso = codigoPaso;
        this.codigoOperador = codigoOperador;
        this.fechaHora = fechaHora;
        this.fechaRecaudo = fechaRecaudo;
        this.codigoCliente = codigoCliente;
        this.placa = placa;
        this.tid = tid;
        this.epc = epc;
        this.estacion = estacion;
        this.carril = carril;
        this.valor = valor;
        this.cantidadEjes = cantidadEjes;
        this.cantidadDobleRuedas = cantidadDobleRuedas;
        this.categoriaDAC = categoriaDAC;
        this.categoriaCobrada = categoriaCobrada;
        this.tipoLectura = tipoLectura;
        this.sentido = sentido;
        this.placaOCR = placaOCR;
        this.existeDescrepancia = existeDescrepancia;
        this.fechaActualizacionUsuario = fechaActualizacionUsuario;
        this.codigoListaUsuario = codigoListaUsuario;
        this.existeDiscrepanciaPlaca = existeDiscrepanciaPlaca;
    }

    public String getCodigoPaso() {
        return codigoPaso;
    }

    public void setCodigoPaso(String codigoPaso) {
        this.codigoPaso = codigoPaso;
    }

    public String getCodigoOperador() {
        return codigoOperador;
    }

    public void setCodigoOperador(String codigoOperador) {
        this.codigoOperador = codigoOperador;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getFechaRecaudo() {
        return fechaRecaudo;
    }

    public void setFechaRecaudo(String fechaRecaudo) {
        this.fechaRecaudo = fechaRecaudo;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getEpc() {
        return epc;
    }

    public void setEpc(String epc) {
        this.epc = epc;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    public String getCarril() {
        return carril;
    }

    public void setCarril(String carril) {
        this.carril = carril;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getCantidadEjes() {
        return cantidadEjes;
    }

    public void setCantidadEjes(int cantidadEjes) {
        this.cantidadEjes = cantidadEjes;
    }

    public int getCantidadDobleRuedas() {
        return cantidadDobleRuedas;
    }

    public void setCantidadDobleRuedas(int cantidadDobleRuedas) {
        this.cantidadDobleRuedas = cantidadDobleRuedas;
    }

    public String getCategoriaDAC() {
        return categoriaDAC;
    }

    public void setCategoriaDAC(String categoriaDAC) {
        this.categoriaDAC = categoriaDAC;
    }

    public String getCategoriaCobrada() {
        return categoriaCobrada;
    }

    public void setCategoriaCobrada(String categoriaCobrada) {
        this.categoriaCobrada = categoriaCobrada;
    }

    public int getTipoLectura() {
        return tipoLectura;
    }

    public void setTipoLectura(int tipoLectura) {
        this.tipoLectura = tipoLectura;
    }

    public String getSentido() {
        return sentido;
    }

    public void setSentido(String sentido) {
        this.sentido = sentido;
    }

    public String getPlacaOCR() {
        return placaOCR;
    }

    public void setPlacaOCR(String placaOCR) {
        this.placaOCR = placaOCR;
    }

    public String getExisteDescrepancia() {
        return existeDescrepancia;
    }

    public void setExisteDescrepancia(String existeDescrepancia) {
        this.existeDescrepancia = existeDescrepancia;
    }

    public String getFechaActualizacionUsuario() {
        return fechaActualizacionUsuario;
    }

    public void setFechaActualizacionUsuario(String fechaActualizacionUsuario) {
        this.fechaActualizacionUsuario = fechaActualizacionUsuario;
    }

    public String getCodigoListaUsuario() {
        return codigoListaUsuario;
    }

    public void setCodigoListaUsuario(String codigoListaUsuario) {
        this.codigoListaUsuario = codigoListaUsuario;
    }

    public String getExisteDiscrepanciaPlaca() {
        return existeDiscrepanciaPlaca;
    }

    public void setExisteDiscrepanciaPlaca(String existeDiscrepanciaPlaca) {
        this.existeDiscrepanciaPlaca = existeDiscrepanciaPlaca;
    }

    @Override
    public String toString() {
        return "[{"
                + "\"codigoPaso\":\"" + codigoPaso + "\""
                + ", \"codigoOperador\":\"" + codigoOperador + "\""
                + ", \"fechaHora\":\"" + fechaHora + "\""
                + ", \"fechaRecaudo\":\"" + fechaRecaudo + "\""
                + ", \"codigoCliente\":\"" + codigoCliente + "\""
                + ", \"placa\":\"" + placa + "\""
                + ", \"tid\":\"" + tid + "\""
                + ", \"epc\":\"" + epc + "\""
                + ", \"estacion\":\"" + estacion + "\""
                + ", \"carril\":\"" + carril + "\""
                + ", \"valor\": "+valor+""
                + ", \"cantidadEjes\":" + cantidadEjes + ""
                + ", \"cantidadDobleRuedas\":" + cantidadDobleRuedas + ""
                + ", \"categoriaDAC\":\"" + categoriaDAC + "\""
                + ", \"categoriaCobrada\":\"" + categoriaCobrada + "\""
                + ", \"tipoLectura\":" + tipoLectura + ""
                + ", \"sentido\":\"" + sentido + "\""
                + ", \"placaOCR\":\"" + placaOCR + "\""
                + ", \"existeDescrepancia\":\"" + existeDescrepancia + "\""
                + ", \"fechaActualizacionUsuario\":\"" + fechaActualizacionUsuario + "\""
                + ", \"codigoListaUsuario\":\"" + codigoListaUsuario + "\""
                + ", \"existeDiscrepanciaPlaca\":\"" + existeDiscrepanciaPlaca + "\""
                + "}]";
    }
}
