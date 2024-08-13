# language: pt
  Funcionalidade: Receber desconto da Qazando
    eu como usuario da qazando
    quero receber cupom de desconto
    para comprar um curso com valor reduzido

    Cenário: visualizar codigo de desconto
      Dado que eu estou no site da qazando
      Quando  eu preencho meu email
      E tambem clico em ganhar cupom
      Então eu vejo o código de desconto.
