package org.example;

public class No<T> {
    private  T conteudo;
    private  No<T> proximo;

    public No(T contedo) {
        this.proximo = null;
        this.conteudo = contedo;
    }

    public T getContedo() {
        return conteudo;
    }

    public void setContedo(T contedo) {
        this.conteudo = contedo;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "{" +
                "contedo='" + conteudo + '\'' +
                '}';
    }
}