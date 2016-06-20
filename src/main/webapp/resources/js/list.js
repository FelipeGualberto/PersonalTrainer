$(document).ready(function() {

	$('#home').click(function() {
		window.location.replace("/personaltrainer/listusers");
	});
	$('#profile').click(function() {
		window.location.replace("/personaltrainer/profile");
	});
	$('#exit').click(function() {
		var request;
		request = $.ajax({
	        url: "/personaltrainer/logout",
	        type: "post",
	    });
	});

});