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
	modal.find('.modal-body span').html('Tem certeza que deseja excluir o cliente <stromg>'+nomeCliente+'</strong> ?');
});

$(function(){
	$('[rel="tooltip"]').tooltip()
})




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
