abstract class Aplicacao {

    protected Documento doc;


    abstract Documento criaDocumento();

    void novoDocumento() {
        this.doc = this.criaDocumento();
    }

    void abrirDocumento() {
        this.doc.abrir();
    }
}