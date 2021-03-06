package com.redhat.ponto;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Solicitacao implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String nomeDoSolicitante;
   private java.lang.String emailDoSolicitante;
   private java.util.Date dataDaCorrecao;
   private java.lang.String motivoDaCorrecao;
   private java.lang.String descricaoDaCorrecao;

   private java.lang.Boolean aprovacaoDoGerente;

   private java.lang.Boolean aprovacaoDoMedico;

   private java.lang.String listaDeEmailFinal;

   public Solicitacao()
   {
   }

   public java.lang.String getNomeDoSolicitante()
   {
      return this.nomeDoSolicitante;
   }

   public void setNomeDoSolicitante(java.lang.String nomeDoSolicitante)
   {
      this.nomeDoSolicitante = nomeDoSolicitante;
   }

   public java.lang.String getEmailDoSolicitante()
   {
      return this.emailDoSolicitante;
   }

   public void setEmailDoSolicitante(java.lang.String emailDoSolicitante)
   {
      this.emailDoSolicitante = emailDoSolicitante;
   }

   public java.util.Date getDataDaCorrecao()
   {
      return this.dataDaCorrecao;
   }

   public void setDataDaCorrecao(java.util.Date dataDaCorrecao)
   {
      this.dataDaCorrecao = dataDaCorrecao;
   }

   public java.lang.String getMotivoDaCorrecao()
   {
      return this.motivoDaCorrecao;
   }

   public void setMotivoDaCorrecao(java.lang.String motivoDaCorrecao)
   {
      this.motivoDaCorrecao = motivoDaCorrecao;
   }

   public java.lang.String getDescricaoDaCorrecao()
   {
      return this.descricaoDaCorrecao;
   }

   public void setDescricaoDaCorrecao(java.lang.String descricaoDaCorrecao)
   {
      this.descricaoDaCorrecao = descricaoDaCorrecao;
   }

   public String toString()
   {
      return "SOLICITACAO: [\n" +
            "    Nome do solicitante: " + nomeDoSolicitante + "\n" +
            "    Email do solicitante: " + emailDoSolicitante + "\n" +
            "    Data da correcao: " + dataDaCorrecao + "\n" +
            "    Motivo da correcao: " + motivoDaCorrecao + "\n" +
            "    Descricao da correcao: " + descricaoDaCorrecao + "\n" +
            "    Aprovacao do Gerente: " + aprovacaoDoGerente + "\n" +
            "    Aprovacao do Medico: " + aprovacaoDoMedico + "\n" +
            "    Lista de emails final: " + listaDeEmailFinal + "\n" +
            "]";
   }

   public java.lang.Boolean getAprovacaoDoGerente()
   {
      return this.aprovacaoDoGerente;
   }

   public void setAprovacaoDoGerente(java.lang.Boolean aprovacaoDoGerente)
   {
      this.aprovacaoDoGerente = aprovacaoDoGerente;
   }

   public java.lang.Boolean getAprovacaoDoMedico()
   {
      return this.aprovacaoDoMedico;
   }

   public void setAprovacaoDoMedico(java.lang.Boolean aprovacaoDoMedico)
   {
      this.aprovacaoDoMedico = aprovacaoDoMedico;
   }

   public java.lang.String getListaDeEmailFinal()
   {
      return this.listaDeEmailFinal;
   }

   public void setListaDeEmailFinal(java.lang.String listaDeEmailFinal)
   {
      this.listaDeEmailFinal = listaDeEmailFinal;
   }

   public Solicitacao(java.lang.String nomeDoSolicitante,
         java.lang.String emailDoSolicitante, java.util.Date dataDaCorrecao,
         java.lang.String motivoDaCorrecao,
         java.lang.String descricaoDaCorrecao,
         java.lang.Boolean aprovacaoDoGerente,
         java.lang.Boolean aprovacaoDoMedico, java.lang.String listaDeEmailFinal)
   {
      this.nomeDoSolicitante = nomeDoSolicitante;
      this.emailDoSolicitante = emailDoSolicitante;
      this.dataDaCorrecao = dataDaCorrecao;
      this.motivoDaCorrecao = motivoDaCorrecao;
      this.descricaoDaCorrecao = descricaoDaCorrecao;
      this.aprovacaoDoGerente = aprovacaoDoGerente;
      this.aprovacaoDoMedico = aprovacaoDoMedico;
      this.listaDeEmailFinal = listaDeEmailFinal;
   }

}