
$(document).ready(function(){


// FUNÇÃO DO MODAL DE EXCLUSÃO DE CLIENTE------------------------------------------------------------------------------------------

	$('#confirmacaoExclusaoModal').on('show.bs.modal',function(event){
		var button=$(event.relatedTarget);
		var idCliente=button.data('id');
		var nomeCliente = button.data('nome');
		
		var modal = $(this);
		var form = modal.find('form');
		var action = form.data('url-base');
		if(!action.endsWith('/')){
			action+='/';
		}
		form.attr('action', action+idCliente);
		modal.find('.modal-body span').html('TEM CERTEZA QUE DESEJA APAGAR O CLIENTE <br><i>'+nomeCliente+'</i> ?');
	});	
	 
// FUNÇÃO PARA FUNCIONAMENTO DO TOOLTIP (MENSAGENS DE AVISO)-----------------------------------------------------------------------

	$(function(){
		$('[rel="tooltip"]').tooltip()
	})
	
// FUNÇÃO DE INSERÇÃO DE MASCARAS NOS PREENCHIMENTOS DO FORMULÁRIO-----------------------------------------------------------------
	
	$(function(){
				$("#cnpj").mask("00.000.000/0000-00")
				$("#cep").mask("00000-000")
				$("#telefone").mask("(00) 0000-00009")
				$("#telefoneContato").mask("(00) 0000-00009")
			
				$("#telefone").blur(function(event){
					if ($(this).val().length == 15){
						$("#telefone").mask("(00) 00000-0009")
					}else{
						$("#telefone").mask("(00) 0000-00009")
					}
				})
				
				$("#telefoneContato").blur(function(event){
					if ($(this).val().length == 15){
						$("#telefoneContato").mask("(00) 00000-0009")
					}else{
						$("#telefoneContato").mask("(00) 0000-00009")
					}
				})	
	})
				
// FUNÇÃO DE VALIDAÇÃO DOS CAMPOS DO FORMULÁRIO-----------------------------------------------------------------------------------
		
	$("#formCadastro").validate({
				rules:{
					nome: {
						required: true,
						maxlength: 100,
						minlength: 5,
					},
					cnpj: {
						required: true,
						minlength: 18,
					},
					telefone: {
						required: true,
						minlength: 14,
					},
					logradouro: {
						letterswithbasicpunc:true,
						maxlength: 100,
						minlength: 4,
					},
					numero: {
						maxlength: 7,
						integer:true,
					},
					bairro: {
						letterswithbasicpunc:true,
						maxlength: 70,
						minlength: 4,
					},
					cep: {
						minlength: 9,
					},
					cidade: {
						letterswithbasicpunc:true,
						maxlength: 70,
						minlength: 4,
					},
					observacao: {
						maxlength: 190,
					},
					nomeContato: {
						letterswithbasicpunc:true,
						maxlength: 20,
						minlength: 3,
					},
					telefoneContato: {
						minlength: 14,
					},
					emailContato: {
						email: true,
						maxlength: 50,
					},	
				},
	})
	
//---------------------------------------------------------------------------------------------------------------------------------
			
})
