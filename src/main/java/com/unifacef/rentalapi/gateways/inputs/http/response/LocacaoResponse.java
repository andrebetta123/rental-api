package com.unifacef.rentalapi.gateways.inputs.http.response;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.unifacef.rentalapi.domain.Carro;
import com.unifacef.rentalapi.domain.Cliente;
import com.unifacef.rentalapi.domain.Kilometros;
import com.unifacef.rentalapi.domain.Locacao;
import com.unifacef.rentalapi.domain.Preco;
import com.unifacef.rentalapi.domain.StatusTanque;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class LocacaoResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	@ApiModelProperty(dataType = "java.util.Date")
	private LocalDateTime dataEntrega;
	@ApiModelProperty(dataType = "java.util.Date")
	private LocalDateTime dataLocacao;
	private Carro carro;
	private Cliente cliente;
	private Preco preco;
	private Kilometros kilometros;
	private StatusTanque statusTanque;
	private Boolean ativo;
	@ApiModelProperty(dataType = "java.util.Date")
	private LocalDateTime dataInclusao;
	@ApiModelProperty(dataType = "java.util.Date")
	private LocalDateTime dataModificacao;

	public LocacaoResponse(final Locacao locacao) {
		this.id = locacao.getId();
		this.dataEntrega = locacao.getDataEntrega();
		this.dataLocacao = locacao.getDataLocacao();
		this.carro = locacao.getCarro();
		this.cliente = locacao.getCliente();
		this.preco = locacao.getPreco();
		this.kilometros = locacao.getKilometros();
		this.statusTanque = locacao.getStatusTanque();
		this.ativo = locacao.getAtivo();
		this.dataInclusao = locacao.getDataInclusao();
		this.dataModificacao = locacao.getDataModificacao();
	}

}
