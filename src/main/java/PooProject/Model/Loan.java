package PooProject.Model;

import java.util.Date;

public class Loan {
    private Long idEmprestimo;
    private Date dataEmprestimo;
    private Date dataPrevistaDevolucao;
    private Date dataDevolucaoReal;

    private User user;
    private Copy copy;
    private Fine fine;

    public Long getIdEmprestimo() {
        return idEmprestimo;
    }

    public void setIdEmprestimo(Long idEmprestimo) {
        this.idEmprestimo = idEmprestimo;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }

    public void setDataPrevistaDevolucao(Date dataPrevistaDevolucao) {
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    }

    public Date getDataDevolucaoReal() {
        return dataDevolucaoReal;
    }

    public void setDataDevolucaoReal(Date dataDevolucaoReal) {
        this.dataDevolucaoReal = dataDevolucaoReal;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Copy getCopy() {
        return copy;
    }

    public void setCopy(Copy copy) {
        this.copy = copy;
    }

    public Fine getFine() {
        return fine;
    }

    public void setFine(Fine fine) {
        this.fine = fine;
    }

    public double calculateFine() {
        return 0.0;
    }

    public void closeLoan() {

    }
}
