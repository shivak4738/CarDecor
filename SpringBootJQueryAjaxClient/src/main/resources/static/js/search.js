$( document ).ready(function() {

	$("#inputFilter").on("keyup", function() {
		var inputValue = $(this).val().toLowerCase();
		$(".carItems ul li").filter(function() {
			$(this).toggle($(this).text().toLowerCase().indexOf(inputValue) > -1)
		});
	});

	$(".carItems ul li").on("click", function(){
		var inputValue = $(this).text();
		console.log(inputValue);
	});

})