$(document).ready(function() {

	$('#home').click(function() {
		window.location.replace("/personaltrainer/listusers");
	});
	$('#profile').click(function() {
		window.location.replace("/personaltrainer/profile");
	});
	$('#aluno').click(function() {
		var request;
		request = $.ajax({
	        url: "/personaltrainer/perfilaluno",
	        type: "post",
	    });
	});

});