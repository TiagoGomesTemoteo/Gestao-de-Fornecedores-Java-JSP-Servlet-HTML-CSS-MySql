/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dominio;

/**
 *
 * @author Tiago
 */
public class TipoEndereco {
    private String descricao;

    public TipoEndereco() {
       this.descricao = " ";
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoEndereco(String descricao) {
        this.descricao = descricao;
    }
    
    
}
