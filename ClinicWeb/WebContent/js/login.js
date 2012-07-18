// document ready function
$(document).ready(function() {
	$("#loginForm").validate({
    	rules: {
    		username: {
				required: true,
				minlength: 2
			},
			password: {
				required: true,
				minlength: 6
			}
		},
		messages: {
			username: {
				required: "Please type username",
				minlength: "Username must consist of at least 2 characters"
			},
			password: {
				required: "Please provide a password",
				minlength: "Your password must be at least 6 characters long"
			},
		},
		submitHandler: function(form) {
		  form.submit();
		}
    });

    //logo rotation
	
	$(".logo img").rotate({ 
	   bind: 
	     { 
	        mouseover : function() { 
	            $(this).rotate({animateTo:360})
	        },
	        mouseout : function() { 
	            $(this).rotate({animateTo:0})
	        }
	     } 
	});
});