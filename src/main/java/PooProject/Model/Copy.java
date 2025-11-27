package PooProject.Model;

public class Copy {
    private Long idExemplar;
    private String codigoBarras;
    private String estadoConservacao;
    private String status; // Available / Loaned / Reserved / Damaged

    private Book book;

    public Copy() {

    }

    public Long getIdExemplar() {
        return idExemplar;
    }

    public void setIdExemplar(Long idExemplar) {
        this.idExemplar = idExemplar;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getEstadoConservacao() {
        return estadoConservacao;
    }

    public void setEstadoConservacao(String estadoConservacao) {
        this.estadoConservacao = estadoConservacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void loan() {
        this.status = "Loaned";
    }

    public void returnCopy() {
        this.status = "Available";
    }

    public void markAsDamaged() {
        this.status = "Damaged";
    }
}