package br.com.ciabfebraban.ws;

import java.net.URL;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/ticket")
public class TicketWS {

	@Context HttpServletRequest request;
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_HTML)
	@Path("/{name}/{value}")
	public Response generateTicket(@PathParam("name") String name, @PathParam("value") String value) {		
		
		URL location = TicketWS.class.getProtectionDomain().getCodeSource().getLocation();
        System.out.println(location.getFile());
		
		
		String boleto = "<!DOCTYPE HTML PUBLIC '-//W3C//DTD HTML 4.0 Transitional//EN'><HTML>\n" + 
				"<HEAD>\n" + 
				"<TITLE>BOLETO</TITLE>\n" + 
				"<META http-equiv=Content-Type content=text/html charset=UTF-8>\n" + 
				"<meta name=\"Generator\" content=\"Projeto BoletoPHP - www.boletophp.com.br - Licença GPL\" />\n" + 
				"<style type=text/css>\n" + 
				"<!--.cp {  font: bold 10px Arial; color: black}\n" + 
				"<!--.ti {  font: 9px Arial, Helvetica, sans-serif}\n" + 
				"<!--.ld { font: bold 15px Arial; color: #000000}\n" + 
				"<!--.ct { FONT: 9px \"Arial Narrow\"; COLOR: #000033}\n" + 
				"<!--.cn { FONT: 9px Arial; COLOR: black }\n" + 
				"<!--.bc { font: bold 20px Arial; color: #000000 }\n" + 
				"<!--.ld2 { font: bold 12px Arial; color: #000000 }\n" + 
				"--></style> \n" + 
				"</head>\n" + 
				"<BODY text=#000000 bgColor=#ffffff topMargin=0 rightMargin=0>\n" + 
				"<table width=666 cellspacing=0 cellpadding=0 border=0><tr><td valign=top class=cp><DIV ALIGN=\"CENTER\">Instruções \n" + 
				"de Impressão</DIV></TD></TR><TR><TD valign=top class=cp><DIV ALIGN=\"left\">\n" + 
				"<p>\n" + 
				"<li>Imprima em impressora jato de tinta (ink jet) ou laser em qualidade normal ou alta (Não use modo econômico).<br>\n" + 
				"<li>Utilize folha A4 (210 x 297 mm) ou Carta (216 x 279 mm) e margens mínimas à esquerda e à direita do formulário.<br>\n" + 
				"<li>Corte na linha indicada. Não rasure, risque, fure ou dobre a região onde se encontra o código de barras.<br>\n" + 
				"<li>Caso não apareça o código de barras no final, clique em F5 para atualizar esta tela.\n" + 
				"<li>Caso tenha problemas ao imprimir, copie a seqüencia numérica abaixo e pague no caixa eletrônico ou no internet banking:<br><br>\n" + 
				"<span class=\"ld2\">\n" + 
				"&nbsp;&nbsp;&nbsp;&nbsp;Linha digitável: &nbsp;00000.00000.00000.000000.00000.000000.0.000000000" + value +"<br>\n" + 
				"&nbsp;&nbsp;&nbsp;&nbsp;Valor: &nbsp;&nbsp;" + value + "<br>\n" + 
				"</span>\n" + 
				"</DIV></td></tr></table><br><table cellspacing=0 cellpadding=0 width=666 border=0><TBODY><TR><TD class=ct width=666><img height=1 src=imagens/6.png width=665 border=0></TD></TR><TR><TD class=ct width=666><div align=right><b class=cp>Recibo \n" + 
				"do Sacado</b></div></TD></tr></tbody></table><table width=666 cellspacing=5 cellpadding=0 border=0><tr><td width=41></TD></tr></table>\n" + 
				"<table width=666 cellspacing=5 cellpadding=0 border=0 align=Default>\n" + 
				"  <tr>\n" + 
				"    <!-- <td width=41><IMG SRC=\"imagens/logo_empresa.png\"></td> -->\n" + 
				"    <td class=\"ti\" width=455><br>\n" + 
				"    </td>\n" + 
				"    <td align=RIGHT width=150 class=ti>&nbsp;</td>\n" + 
				"  </tr>\n" + 
				"</table>\n" + 
				"<BR><table cellspacing=0 cellpadding=0 width=666 border=0><tr><td class=cp width=150> \n" + 
				"  <span class=\"campo\"><IMG \n" + 
				"      src=\"imagens/logounibanco.jpg\" width=\"150\" height=\"40\" \n" + 
				"      border=0></span></td>\n" + 
				"<td width=3 valign=bottom><img height=22 src=imagens/3.png width=2 border=0></td><td class=cpt width=58 valign=bottom><div align=center><font class=bc></font></div></td><td width=3 valign=bottom><img height=22 src=imagens/3.png width=2 border=0></td><td class=ld align=right width=453 valign=bottom><span class=ld> \n" + 
				"<span class=\"campotitulo\">\n" + 
				"</span></span></td>\n" + 
				"</tr><tbody><tr><td colspan=5><img height=2 src=imagens/2.png width=666 border=0></td></tr></tbody></table><table cellspacing=0 cellpadding=0 border=0><tbody><tr><td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=298 height=13>Cedente</td><td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=126 height=13>Agência/Código \n" + 
				"do Cedente</td><td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=2 border=0></td><td class=ct valign=top width=34 height=13>Espécie</td><td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=53 height=13>Quantidade</td><td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=120 height=13>Nosso \n" + 
				"número</td></tr><tr><td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top width=298 height=12> \n" + 
				"  <span class=\"campo\"></span></td>\n" + 
				"<td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top width=126 height=12> \n" + 
				"  <span class=\"campo\">\n" + 
				" \n" + 
				"  </span></td>\n" + 
				"<td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top  width=34 height=12><span class=\"campo\">\n" + 
				"\n" + 
				"</span> \n" + 
				" </td>\n" + 
				"<td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top  width=53 height=12><span class=\"campo\">\n" + 
				"\n" + 
				"</span> \n" + 
				" </td>\n" + 
				"<td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top align=right width=120 height=12> \n" + 
				"  <span class=\"campo\">\n" + 
				"\n" + 
				"  </span></td>\n" + 
				"</tr><tr><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=298 height=1><img height=1 src=imagens/2.png width=298 border=0></td><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=126 height=1><img height=1 src=imagens/2.png width=126 border=0></td><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=34 height=1><img height=1 src=imagens/2.png width=34 border=0></td><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=53 height=1><img height=1 src=imagens/2.png width=53 border=0></td><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=120 height=1><img height=1 src=imagens/2.png width=120 border=0></td></tr></tbody></table><table cellspacing=0 cellpadding=0 border=0><tbody><tr><td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top colspan=3 height=13>Número \n" + 
				"do documento</td><td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=132 height=13>CPF/CNPJ</td><td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=134 height=13>Vencimento</td><td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=180 height=13>Valor \n" + 
				"documento</td></tr><tr><td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top colspan=3 height=12> \n" + 
				"  <span class=\"campo\">\n" + 
				"\n" + 
				"  </span></td>\n" + 
				"<td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top width=132 height=12> \n" + 
				"  <span class=\"campo\">\n" + 
				"\n" + 
				"  </span></td>\n" + 
				"<td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top width=134 height=12> \n" + 
				"  <span class=\"campo\">\n" + 
				"\n" + 
				"  </span></td>\n" + 
				"<td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top align=right width=180 height=12> \n" + 
				"  <span class=\"campo\">\n" + 
				"\n" + 
				"  </span></td>\n" + 
				"</tr><tr><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=113 height=1><img height=1 src=imagens/2.png width=113 border=0></td><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=72 height=1><img height=1 src=imagens/2.png width=72 border=0></td><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=132 height=1><img height=1 src=imagens/2.png width=132 border=0></td><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=134 height=1><img height=1 src=imagens/2.png width=134 border=0></td><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=180 height=1><img height=1 src=imagens/2.png width=180 border=0></td></tr></tbody></table><table cellspacing=0 cellpadding=0 border=0><tbody><tr><td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=113 height=13>(-) \n" + 
				"Desconto / Abatimentos</td><td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=112 height=13>(-) \n" + 
				"Outras deduções</td><td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=113 height=13>(+) \n" + 
				"Mora / Multa</td><td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=113 height=13>(+) \n" + 
				"Outros acréscimos</td><td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=180 height=13>(=) \n" + 
				"Valor cobrado</td></tr><tr>" + value + "<td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top align=right width=113 height=12></td><td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top align=right width=112 height=12></td><td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top align=right width=113 height=12></td><td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top align=right width=113 height=12></td><td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top align=right width=180 height=12></td></tr><tr><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=113 height=1><img height=1 src=imagens/2.png width=113 border=0></td><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=112 height=1><img height=1 src=imagens/2.png width=112 border=0></td><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=113 height=1><img height=1 src=imagens/2.png width=113 border=0></td><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=113 height=1><img height=1 src=imagens/2.png width=113 border=0></td><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=180 height=1><img height=1 src=imagens/2.png width=180 border=0></td></tr></tbody></table><table cellspacing=0 cellpadding=0 border=0><tbody><tr><td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=659 height=13>Sacado</td></tr><tr><td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top width=659 height=12> \n" + 
				"  <span class=\"campo\">\n" + 
				"\n" + 
				"  </span></td>\n" + 
				"</tr><tr><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=659 height=1><img height=1 src=imagens/2.png width=659 border=0></td></tr></tbody></table><table cellspacing=0 cellpadding=0 border=0><tbody><tr><td class=ct  width=7 height=12></td><td class=ct  width=564 >Demonstrativo</td><td class=ct  width=7 height=12></td><td class=ct  width=88 >Autenticação \n" + 
				"mecânica</td></tr><tr><td  width=7 ></td><td class=cp width=564 >\n" + 
				"<span class=\"campo\">\n" + 
				" <br>\n" + 
				" <br>\n" + 
				" <br>\n" + 
				"  </span>\n" + 
				"  </td><td  width=7 ></td><td  width=88 ></td></tr></tbody></table><table cellspacing=0 cellpadding=0 width=666 border=0><tbody><tr><td width=7></td><td  width=500 class=cp> \n" + 
				"<br><br><br> \n" + 
				"</td><td width=159></td></tr></tbody></table><table cellspacing=0 cellpadding=0 width=666 border=0><tr><td class=ct width=666></td></tr><tbody><tr><td class=ct width=666> \n" + 
				"<div align=right>Corte na linha pontilhada</div></td></tr><tr><td class=ct width=666><img height=1 src=imagens/6.png width=665 border=0></td></tr></tbody></table><br><table cellspacing=0 cellpadding=0 width=666 border=0><tr><td class=cp width=150> \n" + 
				"  <span class=\"campo\"><IMG \n" + 
				"      src=\"imagens/logounibanco.jpg\" width=\"150\" height=\"40\" \n" + 
				"      border=0></span></td>\n" + 
				"<td width=3 valign=bottom><img height=22 src=imagens/3.png width=2 border=0></td><td class=cpt width=58 valign=bottom><div align=center><font class=bc></font></div></td><td width=3 valign=bottom><img height=22 src=imagens/3.png width=2 border=0></td><td class=ld align=right width=453 valign=bottom><span class=ld> \n" + 
				"<span class=\"campotitulo\">\n" + 
				"00000.00000.00000.000000.00000.000000.0.00000000015000\n" + 
				"</span></span></td>\n" + 
				"</tr><tbody><tr><td colspan=5><img height=2 src=imagens/2.png width=666 border=0></td></tr></tbody></table><table cellspacing=0 cellpadding=0 border=0><tbody><tr><td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=472 height=13>Local \n" + 
				"de pagamento</td><td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=180 height=13>Vencimento</td></tr><tr><td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top width=472 height=12>Pagável \n" + 
				"em qualquer Banco até o vencimento</td><td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top align=right width=180 height=12> \n" + 
				"  <span class=\"campo\">\n" + 
				"  </span></td>\n" + 
				"</tr><tr><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=472 height=1><img height=1 src=imagens/2.png width=472 border=0></td><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=180 height=1><img height=1 src=imagens/2.png width=180 border=0></td></tr></tbody></table><table cellspacing=0 cellpadding=0 border=0><tbody><tr><td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=472 height=13>Cedente</td><td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0>" + name + "</td><td class=ct valign=top width=180 height=13>Agência/Código \n" + 
				"cedente</td></tr><tr><td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top width=472 height=12> \n" + 
				"  <span class=\"campo\">\n" + 
				"  \n" + 
				"  </span></td>\n" + 
				"<td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top align=right width=180 height=12> \n" + 
				"  <span class=\"campo\">\n" + 
				"\n" + 
				"  </span></td>\n" + 
				"</tr><tr><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=472 height=1><img height=1 src=imagens/2.png width=472 border=0></td><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=180 height=1><img height=1 src=imagens/2.png width=180 border=0></td></tr></tbody></table><table cellspacing=0 cellpadding=0 border=0><tbody><tr><td class=ct valign=top width=7 height=13> \n" + 
				"<img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=113 height=13>Data \n" + 
				"do documento</td><td class=ct valign=top width=7 height=13> <img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=163 height=13>N<u>o</u> \n" + 
				"documento</td><td class=ct valign=top width=7 height=13> <img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=62 height=13>Espécie \n" + 
				"doc.</td><td class=ct valign=top width=7 height=13> <img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=34 height=13>Aceite</td><td class=ct valign=top width=7 height=13> \n" + 
				"<img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=72 height=13>Data \n" + 
				"processamento</td><td class=ct valign=top width=7 height=13> <img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=180 height=13>Nosso \n" + 
				"número</td></tr><tr><td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top  width=113 height=12><div align=left> \n" + 
				"  <span class=\"campo\">\n" + 
				"  \n" + 
				"  </span></div></td><td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top width=163 height=12> \n" + 
				"    <span class=\"campo\">\n" + 
				"    \n" + 
				"    </span></td>\n" + 
				"  <td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top  width=62 height=12><div align=left><span class=\"campo\">\n" + 
				"    \n" + 
				"  </span> \n" + 
				" </div></td><td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top  width=34 height=12><div align=left><span class=\"campo\">\n" + 
				" \n" + 
				" </span> \n" + 
				" </div></td><td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top  width=72 height=12><div align=left> \n" + 
				"   <span class=\"campo\">\n" + 
				"   \n" + 
				"   </span></div></td><td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top align=right width=180 height=12> \n" + 
				"     <span class=\"campo\">\n" + 
				"     \n" + 
				"     </span></td>\n" + 
				"</tr><tr><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=113 height=1><img height=1 src=imagens/2.png width=113 border=0></td><td valign=top width=7 height=1> \n" + 
				"<img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=163 height=1><img height=1 src=imagens/2.png width=163 border=0></td><td valign=top width=7 height=1> \n" + 
				"<img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=62 height=1><img height=1 src=imagens/2.png width=62 border=0></td><td valign=top width=7 height=1> \n" + 
				"<img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=34 height=1><img height=1 src=imagens/2.png width=34 border=0></td><td valign=top width=7 height=1> \n" + 
				"<img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=72 height=1><img height=1 src=imagens/2.png width=72 border=0></td><td valign=top width=7 height=1> \n" + 
				"<img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=180 height=1> \n" + 
				"<img height=1 src=imagens/2.png width=180 border=0></td></tr></tbody></table><table cellspacing=0 cellpadding=0 border=0><tbody><tr> \n" + 
				"<td class=ct valign=top width=7 height=13> <img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top COLSPAN=\"3\" height=13>Uso \n" + 
				"do banco</td><td class=ct valign=top height=13 width=7> <img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=83 height=13>Carteira</td><td class=ct valign=top height=13 width=7> \n" + 
				"<img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=53 height=13>Espécie</td><td class=ct valign=top height=13 width=7> \n" + 
				"<img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=123 height=13>Quantidade</td><td class=ct valign=top height=13 width=7> \n" + 
				"<img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=72 height=13> \n" + 
				"Valor Documento</td><td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=180 height=13>(=) \n" + 
				"Valor documento</td></tr><tr> <td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td valign=top class=cp height=12 COLSPAN=\"3\"><div align=left> \n" + 
				" </div></td><td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top  width=83> \n" + 
				"<div align=left> <span class=\"campo\">\n" + 
				" \n" + 
				"</span></div></td><td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top  width=53><div align=left><span class=\"campo\">\n" + 
				"\n" + 
				"</span> \n" + 
				" </div></td><td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top  width=123><span class=\"campo\">\n" + 
				"\n" + 
				" </span> \n" + 
				" </td>\n" + 
				" <td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top  width=72> \n" + 
				"   <span class=\"campo\">\n" + 
				"  \n" + 
				"   </span></td>\n" + 
				" <td class=cp valign=top width=7 height=12> <img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top align=right width=180 height=12> \n" + 
				"   <span class=\"campo\">\n" + 
				"  \n" + 
				"   </span></td>\n" + 
				"</tr><tr><td valign=top width=7 height=1> <img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=75 border=0></td><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=31 height=1><img height=1 src=imagens/2.png width=31 border=0></td><td valign=top width=7 height=1> \n" + 
				"<img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=83 height=1><img height=1 src=imagens/2.png width=83 border=0></td><td valign=top width=7 height=1> \n" + 
				"<img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=53 height=1><img height=1 src=imagens/2.png width=53 border=0></td><td valign=top width=7 height=1> \n" + 
				"<img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=123 height=1><img height=1 src=imagens/2.png width=123 border=0></td><td valign=top width=7 height=1> \n" + 
				"<img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=72 height=1><img height=1 src=imagens/2.png width=72 border=0></td><td valign=top width=7 height=1> \n" + 
				"<img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=180 height=1><img height=1 src=imagens/2.png width=180 border=0></td></tr></tbody> \n" + 
				"</table><table cellspacing=0 cellpadding=0 width=666 border=0><tbody><tr><td align=right width=10><table cellspacing=0 cellpadding=0 border=0 align=left><tbody> \n" + 
				"<tr> <td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td></tr><tr> \n" + 
				"<td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td></tr><tr> \n" + 
				"<td valign=top width=7 height=1><img height=1 src=imagens/2.png width=1 border=0></td></tr></tbody></table></td><td valign=top width=468 rowspan=5><font class=ct>Instruções \n" + 
				"(Texto de responsabilidade do cedente)</font><br><br><span class=cp> <FONT class=campo>\n" + 
				"<br>\n" + 
				"<br>\n" + 
				"<br>\n" + 
				"</FONT><br><br> \n" + 
				"</span></td>\n" + 
				"<td align=right width=188><table cellspacing=0 cellpadding=0 border=0><tbody><tr><td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=180 height=13>(-) \n" + 
				"Desconto / Abatimentos</td></tr><tr> <td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top align=right width=180 height=12></td></tr><tr> \n" + 
				"<td valign=top width=7 height=1><img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=180 height=1><img height=1 src=imagens/2.png width=180 border=0></td></tr></tbody></table></td></tr><tr><td align=right width=10> \n" + 
				"<table cellspacing=0 cellpadding=0 border=0 align=left><tbody><tr><td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td></tr><tr><td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td></tr><tr><td valign=top width=7 height=1> \n" + 
				"<img height=1 src=imagens/2.png width=1 border=0></td></tr></tbody></table></td><td align=right width=188><table cellspacing=0 cellpadding=0 border=0><tbody><tr><td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=180 height=13>(-) \n" + 
				"Outras deduções</td></tr><tr><td class=cp valign=top width=7 height=12> <img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top align=right width=180 height=12></td></tr><tr><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=180 height=1><img height=1 src=imagens/2.png width=180 border=0></td></tr></tbody></table></td></tr><tr><td align=right width=10> \n" + 
				"<table cellspacing=0 cellpadding=0 border=0 align=left><tbody><tr><td class=ct valign=top width=7 height=13> \n" + 
				"<img height=13 src=imagens/1.png width=1 border=0></td></tr><tr><td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td></tr><tr><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=1 border=0></td></tr></tbody></table></td><td align=right width=188> \n" + 
				"<table cellspacing=0 cellpadding=0 border=0><tbody><tr><td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=180 height=13>(+) \n" + 
				"Mora / Multa</td></tr><tr><td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top align=right width=180 height=12></td></tr><tr> \n" + 
				"<td valign=top width=7 height=1> <img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=180 height=1> \n" + 
				"<img height=1 src=imagens/2.png width=180 border=0></td></tr></tbody></table></td></tr><tr><td align=right width=10><table cellspacing=0 cellpadding=0 border=0 align=left><tbody><tr> \n" + 
				"<td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td></tr><tr><td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td></tr><tr><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=1 border=0></td></tr></tbody></table></td><td align=right width=188> \n" + 
				"<table cellspacing=0 cellpadding=0 border=0><tbody><tr> <td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=180 height=13>(+) \n" + 
				"Outros acréscimos</td></tr><tr> <td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top align=right width=180 height=12></td></tr><tr><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=180 height=1><img height=1 src=imagens/2.png width=180 border=0></td></tr></tbody></table></td></tr><tr><td align=right width=10><table cellspacing=0 cellpadding=0 border=0 align=left><tbody><tr><td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td></tr><tr><td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td></tr></tbody></table></td><td align=right width=188><table cellspacing=0 cellpadding=0 border=0><tbody><tr><td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=180 height=13>(=) \n" + 
				"Valor cobrado</td></tr><tr><td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top align=right width=180 height=12></td></tr></tbody> \n" + 
				"</table></td></tr></tbody></table><table cellspacing=0 cellpadding=0 width=666 border=0><tbody><tr><td valign=top width=666 height=1><img height=1 src=imagens/2.png width=666 border=0></td></tr></tbody></table><table cellspacing=0 cellpadding=0 border=0><tbody><tr><td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=659 height=13>Sacado</td></tr><tr><td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top width=659 height=12><span class=\"campo\">\n" + 
				"\n" + 
				"</span> \n" + 
				"</td>\n" + 
				"</tr></tbody></table><table cellspacing=0 cellpadding=0 border=0><tbody><tr><td class=cp valign=top width=7 height=12><img height=12 src=imagens/1.png width=1 border=0></td><td class=cp valign=top width=659 height=12><span class=\"campo\">\n" + 
				"</span> \n" + 
				"</td>\n" + 
				"</tr></tbody></table><table cellspacing=0 cellpadding=0 border=0><tbody><tr><td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td><td class=cp valign=top width=472 height=13> \n" + 
				"  <span class=\"campo\">\n" + 
				"  </span></td>\n" + 
				"<td class=ct valign=top width=7 height=13><img height=13 src=imagens/1.png width=1 border=0></td><td class=ct valign=top width=180 height=13>Cód. \n" + 
				"baixa &nbsp;&nbsp;&nbsp;<span class=\"cp\">CVT - 07744-5</span> </td></tr><tr><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=472 height=1><img height=1 src=imagens/2.png width=472 border=0></td><td valign=top width=7 height=1><img height=1 src=imagens/2.png width=7 border=0></td><td valign=top width=180 height=1><img height=1 src=imagens/2.png width=180 border=0></td></tr></tbody></table><TABLE cellSpacing=0 cellPadding=0 border=0 width=666><TBODY><TR><TD class=ct  width=7 height=12></TD><TD class=ct  width=409 >Sacador/Avalista</TD><TD class=ct  width=250 ><div align=right>Autenticação \n" + 
				"mecânica - <b class=cp>Ficha de Compensação</b></div></TD></TR><TR><TD class=ct  colspan=3 ></TD></tr></tbody></table><TABLE cellSpacing=0 cellPadding=0 width=666 border=0><TBODY><TR><TD vAlign=bottom align=left height=50>\n" + 
				" </TD>\n" + 
				"</tr></tbody></table><TABLE cellSpacing=0 cellPadding=0 width=666 border=0><TR><TD class=ct width=666></TD></TR><TBODY><TR><TD class=ct width=666><div align=right>Corte \n" + 
				"na linha pontilhada</div></TD></TR><TR><TD class=ct width=666><img height=1 src=imagens/6.png width=665 border=0></TD></tr></tbody></table>\n" + 
				"</BODY></HTML>";
		
		
		return Response.status(200).entity(boleto).build();
	}
	
}
