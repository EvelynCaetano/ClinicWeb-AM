//------------- Content fix -------------//
contentFix = function (sidebar, content) {
	sidebarH = $(sidebar).height();
	$(content).css('min-height',sidebarH);
 	contentH = $(content).height();
 	contentH = contentH + 45;
 	if(sidebarH>contentH) {
 		if($('div').hasClass('calFix')) {
 			//do noting
 		} else {
			$(content).css('height',sidebarH);
		}
	}
}

// document ready function
$(document).ready(function() {

	//pattern switcher
	$(".patternOn").click(function(){
       $(".pattern").css('right', '0');
       $(".patternOn").css('display', 'none');
       $(".patternOff").css('display', 'block');
       return false;
    });

    $(".patternOff").click(function(){
       $(".pattern").css('right', '-135px');
       $(".patternOff").css('display', 'none');
       $(".patternOn").css('display', 'block');
       return false;
    });

	$(".pattern1").click(function(){
        $("#content").css('background','url(images/patterns/1.png)');
        return false;
    });
    
    $(".pattern2").click(function(){
        $("#content").css('background','url(images/patterns/2.png) repeat');
        return false;
    });
    
    $(".pattern3").click(function(){
        $("#content").css('background','url(images/patterns/3.png) repeat');
        return false;
    });
	
    $(".pattern4").click(function(){
        $("#content").css('background','url(images/patterns/4.png) repeat');
        return false;
    });
    
    $(".pattern5").click(function(){
        $("#content").css('background','url(images/patterns/5.png) repeat');
        return false;
    });
	
    $(".pattern6").click(function(){
        $("#content").css('background','url(images/patterns/6.png) repeat');
        return false;
    });
    
    $(".pattern7").click(function(){
        $("#content").css('background','url(images/patterns/7.png) repeat');
        return false;
    });
    
    $(".pattern8").click(function(){
        $("#content").css('background','url(images/patterns/8.png) repeat');
        return false;
    });
	
    $(".pattern9").click(function(){
        $("#content").css('background','url(images/patterns/9.png) repeat');
        return false;
    });
    
	$(".pattern10").click(function(){
        $("#content").css('background','url(images/patterns/10.png) repeat');
        return false;
    });
	
	$(".pattern11").click(function(){
        $("#content").css('background','url(images/patterns/11.png) repeat');
        return false;
    });
    
    $(".pattern12").click(function(){
        $("#content").css('background','url(images/patterns/12.png) repeat');
        return false;
    });
    
    $(".pattern13").click(function(){
        $("#content").css('background','url(images/patterns/13.png) repeat');
        return false;
    });
	
    $(".pattern14").click(function(){
        $("#content").css('background','url(images/patterns/14.png) repeat');
        return false;
    });
    
    $(".pattern15").click(function(){
        $("#content").css('background','url(images/patterns/15.png) repeat');
        return false;
    });
	
    $(".pattern16").click(function(){
        $("#content").css('background','url(images/patterns/16.png) repeat');
        return false;
    });
    
    $(".pattern17").click(function(){
        $("#content").css('background','url(images/patterns/17.png) repeat');
        return false;
    });
    
    $(".pattern18").click(function(){
        $("#content").css('background','url(images/patterns/18.png) repeat');
        return false;
    });
	
    $(".pattern19").click(function(){
        $("#content").css('background','url(images/patterns/19.png) repeat');
        return false;
    });
    
	$(".pattern20").click(function(){
        $("#content").css('background','url(images/patterns/20.png) repeat');
        return false;
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

	//------------- Globals -------------//

	var divElement = $('div'); //log all div elements
	
	//------------- Footer fix -----------//

	contentFix('#sidebar', '#mainContent');

	//------------- Top Search button -------------//

	$('.tSearch .button').click(function(event) {
		event.preventDefault();
		tForm = $('.tSearch form');
		if (tForm.css('display') == 'none') {
			tForm.show();
		} else {
			tForm.hide();
		}
	});

	//------------- Navigation -------------//
	var mainNav = $('ul.mainnav li');

	mainNav.find('ul').siblings().not('a.iLogout').addClass('hasUl')
	//find if has class current make icon dark
	mainNav.find('a.current>span.icon').not('a.iLogout').removeClass('gray').addClass('white');
	//click magic
	mainNav.find('a').not('a.iLogout').click(function(event) {
		$this = $(this);
			
		if($this.hasClass('hasUl')) {
			event.preventDefault();
			if($this.hasClass('drop')) {
				$(this).siblings('ul.sub').fadeOut(300).siblings().not('a.iLogout').removeClass('drop');
			} else {
				$(this).siblings('ul.sub').fadeIn(200).siblings().not('a.iLogout').addClass('drop');
			}			
		}	
	});

	//responsive navigation
	$('ul.mainnav>li.iMenu>a').click(function(event) {
		$thisOne = $(this);
		if ($thisOne.closest('li').hasClass('show')) {
			$thisOne.closest('li').removeClass('show');
			$('ul.mainnav>li').not('ul.mainnav>li.iMenu').css('display', 'none');
		}else{
			$thisOne.closest('li').addClass('show');
			$('ul.mainnav>li').css('display', 'inline-block');
		}
	});

	//-------------Top notification area --------//

	var topNav = $('ul.topNav li');
	topNav.find('ul').siblings().addClass('hasUl');
	topNav.find('ul>li>a').last('a').addClass('lastest');

	topNav.find('a').click(function(event) {
		var $this = $(this);
		$this.find('span.notification').addClass('read'); //remove notification after read
		if($this.hasClass('hasUl')) {
			event.preventDefault();
			if($this.hasClass('drop')) {
				/*$(this).siblings('ul.sub').fadeOut(300).siblings().removeClass('drop');*/
				$(this).siblings('ul.sub').slideUp(300).siblings().removeClass('drop');
			} else {
				/*$(this).siblings('ul.sub').fadeIn(200).siblings().addClass('drop');*/
				$(this).siblings('ul.sub').slideDown(300).siblings().addClass('drop');
			}
		}
		$(this).parent().hover(function() {}
			, function(){
				/*$(this).find("ul.sub").fadeOut(200);*/
				$(this).find("ul.sub").slideUp(200);
				$(this).find('a') .removeClass("drop");
		});		

	});

	//------------- Code View -------------//

	$('pre.codeview').sourcerer('html php js css');

	//-------------Zebra list-------------//

	$('.zebra li:even').addClass('strip');	

	//------------- Widget -------------//

	//show the minimize and maximize icon in widget
	var widget = $('div.widget');
	var widgetOpen = $('div.widget').not('div.widget.closed');
	var widgetClose = $('div.widget.closed');

	widgetClose.find('div.content').hide();
	widgetClose.find('div.title').addClass('min');
	widgetClose.find('a').removeClass('minimize').addClass('maximize');

	widgetClose.find('.title>a').click(function (event) {
		event.preventDefault();
		var $this = $(this);
		if($this .hasClass('minimize')) {
			//minimize content
			$this.removeClass('minimize').addClass('maximize');
			$this.parent('div').addClass('min');
			cont = $this.parent('div').next('div.content')
			cont.hide();
			contentFix('#sidebar', '#content');
		} else  
		if($this .hasClass('maximize')) {
			//minimize content
			$this.removeClass('maximize').addClass('minimize');
			$this.parent('div').removeClass('min');
			cont = $this.parent('div').next('div.content');
			cont.show();
		} 
		
	})

	widgetOpen.find('.title>a').click(function (event) {
	event.preventDefault();
	var $this = $(this);
	if($this .hasClass('minimize')) {
		//minimize content
		$this.removeClass('minimize').addClass('maximize');
		$this.parent('div').addClass('min');
		cont = $this.parent('div').next('div.content')
		cont.hide();
		contentFix('#sidebar', '#content');
	} else  
	if($this .hasClass('maximize')) {
		//minimize content
		$this.removeClass('maximize').addClass('minimize');
		$this.parent('div').removeClass('min');
		cont = $this.parent('div').next('div.content');
		cont.show();
	} 
		
	})

	//show minimize and maximize icons
	widget.find('.title').hover(function() {
		    $(this).find('a').show();	
		}
		, function(){
			$(this).find('a').hide();	
	});				
	
	//add shadow if hover widgets
	widget.hover(function() {
		    $(this).addClass('hover');	
		}
		, function(){
			$(this).removeClass('hover');	
	});		


	//------------- Accordion -------------//
	
	$(".accordion").accordion({ header: "h3",});

	//------------- Tabs -------------//

	$('#tabs').tabs();

	//------------- Dialog Link -------------//
	$('#openDialog').click(function(){
		$('#dialog').dialog('open');
		return false;
	});

	$('#openModalDialog').click(function(){
		$('#modal').dialog('open');
		return false;
	});

	// Dialog			
	$('#dialog').dialog({
		autoOpen: false,
		dialogClass: 'dialog',
		width: 600,
		buttons: {
			"Close": function() { 
				$(this).dialog("close"); 
			}
		}
	});

	// Modal Dialog			
	$('#modal').dialog({
		autoOpen: false,
		modal: true,
		dialogClass: 'dialog',
		width: 600,
		buttons: {
			"Close": function() { 
				$(this).dialog("close"); 
			}
		}
	});

	$("div.dialog button").addClass("button gray");

	//------------- JGrowl notification -------------//
	
	$("#growlButton").bind("click", function(event) {
		$.jGrowl("Hello from JGrowl notification plugin", {position: "top-right"});
	});
	
	$("#growlButton1").bind("click", function(event) {
		$.jGrowl("This is a sticky message", {sticky: true, position: "top-right"});
	});
	
	$("#growlButton2").bind("click", function(event) {
		$.jGrowl("Nice message with header", {header: "Warrning!!!", position: "top-right"});
	});

	//------------- Calendar -------------//
	
	var date = new Date();
	var d = date.getDate();
	var m = date.getMonth();
	var y = date.getFullYear();
	
	$('#calendar').fullCalendar({
		header: {
			left: 'prev,next, todaytitle',
			center: 'title',
			right: 'month,agendaWeek,agendaDay'
		},
		buttonText: {
	        prev: '<span class="icon thinArrowLeft gray small" style="margin-top:3px;"></span>',
	        next: '<span class="icon thinRightArrow gray small" style="margin-top:3px;"></span>'
	    },
		editable: true,
		events: [
			{
				title: 'All Day Event',
				start: new Date(y, m, 1)
			},
			{
				title: 'Long Event',
				start: new Date(y, m, d-5),
				end: new Date(y, m, d-2)
			},
			{
				id: 999,
				title: 'Repeating Event',
				start: new Date(y, m, d-3, 16, 0),
				allDay: false
			},
			{
				id: 999,
				title: 'Repeating Event',
				start: new Date(y, m, d+4, 16, 0),
				allDay: false
			},
			{
				title: 'Meeting',
				start: new Date(y, m, d, 10, 30),
				allDay: false
			},
			{
				title: 'Lunch',
				start: new Date(y, m, d, 12, 0),
				end: new Date(y, m, d, 14, 0),
				allDay: false
			},
			{
				title: 'Birthday Party',
				start: new Date(y, m, d+1, 19, 0),
				end: new Date(y, m, d+1, 22, 30),
				allDay: false,
				color: '#ff5b5b'
			},
			{
				title: 'Click for SuggeElson',
				start: new Date(y, m, 28),
				end: new Date(y, m, 29),
				url: 'http://suggeelson.com/'
			}
		]
	});


	//------------- Charts -------------//
	// Simple flot chart

	var chartClass = 'simpleChart'

	if (divElement.hasClass(chartClass)) {
		$(function () {
		    var sin = [], cos = [];
		    for (var i = 0; i < 21; i += 0.5) {
		        sin.push([i, Math.sin(i)]);
		        cos.push([i, Math.cos(i)]);
		    }

		    var plot = $.plot($(".simpleChart"),
		           [ { data: sin, label: "sin(x)"}, { data: cos, label: "cos(x)" } ], {
		               series: {
		                   lines: { show: true },
		                   points: { show: true }
		               },
		               grid: { hoverable: true, clickable: true, },
		               yaxis: { min: -1.1, max: 1.1 },
					   xaxis: { min: 0, max: 20 },
					   colors: [ '#5e5d5d', '#8eaab2']
		             });

		    function showTooltip(x, y, contents) {
		        $('<div id="tooltip" class="tooltip">' + contents + '</div>').css( {
		            position: 'absolute',
		            display: 'none',
		            top: y + 10,
		            left: x + 10,
		            border: '4px solid #212934',
		            padding: '5px',
					'z-index': '9999',
		            'background-color': '#373e46',
					'color': '#fffdf8',
					'font-size': '12px',
		            opacity: 0.8
		        }).appendTo("body").fadeIn(200);
		    }

		    var previousPoint = null;
		    $(".simpleChart").bind("plothover", function (event, pos, item) {
		        $("#x").text(pos.x.toFixed(2));
		        $("#y").text(pos.y.toFixed(2));

		        if ($(".simpleChart").length > 0) {
		            if (item) {
		                if (previousPoint != item.dataIndex) {
		                    previousPoint = item.dataIndex;
		                    
		                    $("#tooltip").remove();
		                    var x = item.datapoint[0].toFixed(2),
		                        y = item.datapoint[1].toFixed(2);
		                    
		                    showTooltip(item.pageX, item.pageY,
		                                item.series.label + " of " + x + " = " + y);
		                }
		            }
		            else {
		                $("#tooltip").remove();
		                previousPoint = null;            
		            }
		        }
		    });

		    $(".simpleChart").bind("plotclick", function (event, pos, item) {
		        if (item) {
		            $("#clickdata").text("You clicked point " + item.dataIndex + " in " + item.series.label + ".");
		            plot.highlight(item.series, item.datapoint);
		        }
		    });
		}); 
	}
	// Dynamic chart 
	var chartClass = 'dynamicChart'
	if (divElement.hasClass(chartClass)) {
		$(function () {
			// generate some test data
			var data = [], totalPoints = 500;
			function getRandomData() {
				if (data.length > 0)
					data = data.slice(1);
		
				// do a random walk
				while (data.length < totalPoints) {
					var prev = data.length > 0 ? data[data.length - 1] : 50;
					var y = prev + Math.random() * 10 - 5;
					if (y < 0)
						y = 0;
					if (y > 100)
						y = 100;
					data.push(y);
				}
		
				// zip the generated y values with the x values
				var res = [];
				for (var i = 0; i < data.length; ++i)
					res.push([i, data[i]])
				return res;
			}
		
			// setup control widget
			var updateInterval = 1000;
			$("#updateInterval").val(updateInterval).change(function () {
				var v = $(this).val();
				if (v && !isNaN(+v)) {
					updateInterval = +v;
					if (updateInterval < 1)
						updateInterval = 1;
					if (updateInterval > 2000)
						updateInterval = 2000;
					$(this).val("" + updateInterval);
				}
			});
		
			// setup plot
			var options = {
				yaxis: { min: 0, max: 100 },
				xaxis: { min: 0, max: 100 },
				grid:  { borderWidth: 0 },
				colors: ["#5e5d5d"],
				series: {
						   lines: { 
								lineWidth: 2, 
								fill: true,
								fillColor: { colors: [ { opacity: 0.6 }, { opacity: 0.2 } ] },
								steps: false
		
							}
					   }
			};
			var plot = $.plot($(".dynamicChart"), [ getRandomData() ], options);
		
			function update() {
				plot.setData([ getRandomData() ]);
				// since the axes don't change, we don't need to call plot.setupGrid()
				plot.draw();
				
				setTimeout(update, updateInterval);
			}
		
			update();
		});
	}

	// bars chart 
	var chartClass = 'barsChart'
	if (divElement.hasClass(chartClass)) {
		$(function () {
		    var previousPoint;
		 
		    var data1 = [];
		    for (var i = 0; i <= 10; i += 1)
		        data1.push([i, parseInt(Math.random() * 10)]);
		 
		    var data2 = [];
		    for (var i = 0; i <= 10; i += 1)
		        data2.push([i, parseInt(Math.random() * 10)]);
		 
		    var data3 = [];
		    for (var i = 0; i <= 10; i += 1)
		        data3.push([i, parseInt(Math.random() * 10)]);
		 
		    var dataStorage = new Array();
		 
		     dataStorage.push({
		        data:data1,
		        bars: {
		            show: true, 
		            barWidth: 0.2, 
		            order: 1,
		        }
		    });
		    dataStorage.push({
		        data:data2,
		        bars: {
		            show: true, 
		            barWidth: 0.2, 
		            order: 2
		        }
		    });
		    dataStorage.push({
		        data:data3,
		        bars: {
		            show: true, 
		            barWidth: 0.2, 
		            order: 3
		        }
		    });
		                
		    //tooltip function
		    function showTooltip(x, y, contents) {
		       			
		        $('<div id="tooltipBars" class="tooltip">' + contents + '</div>').css( {
		            position: 'absolute',
		            display: 'none',
		            top: y - 5,
		            left: x + 15,
		            border: '4px solid #212934',
		            padding: '5px',
					'z-index': '9999',
		            'background-color': '#373e46',
					'color': '#fffdf8',
					'font-size': '12px',
		            opacity: 0.8
		        }).prependTo('body').show();
		    }
		                
		    //Display graph
		    $.plot($(".barsChart"), dataStorage, {
		        grid:{
		            hoverable:true,
		            borderWidth: 0
		        },
			    /*colors: [ '#373e48', '#ffb212', '#52860d', '#153a88', '#39404a'],*/
			    colors: [  '#5e5d5d', '#8eaab2']
					  
		    });

		 
		//add tooltip event
		$(".barsChart").bind("plothover", function (event, pos, item) {
		    if (item) {
		        if (previousPoint != item.datapoint) {
		            previousPoint = item.datapoint;
		 
		            //delete tooltip
		            $('.tooltip').remove();
		 
		            var x = item.datapoint[0];
		 
		            
		            if(item.series.bars.order){
		                for(var i=0; i < item.series.data.length; i++){
		                    if(item.series.data[i][3] == item.datapoint[0])
		                        x = item.series.data[i][0];
		                }
		            }
		 
		            var y = item.datapoint[1];
		 
		            showTooltip(item.pageX+5, item.pageY+5,x + " = " + y);
		 
		        }
		    }
		    else {
		        $('.tooltip').remove();
		        previousPoint = null;
		    }
		 
		});
		 
		    
		});
	}

	// pie chart 
	var chartClass = 'pieChart';
	if (divElement.hasClass(chartClass)) {
		
		$(function (){
			var data = [];
			var series = Math.floor(Math.random()*10)+1;
			for( var i = 0; i<series; i++)
			{
				data[i] = { label: "Series"+(i+1), data: Math.floor(Math.random()*100)+1 }
			}

			$.plot($(".pieChart"), data, 
			{
					series: {
						pie: { 
							show: true,
							radius: 1
						}
					},
					legend: {
						show: true
					},
					grid: {
						hoverable: true,
						clickable: false
					}
			});
		  
		});
	}

	// pie chart 2
	var chartClass = 'pieChart2'
	if (divElement.hasClass(chartClass)) {
		$(function (){
			var data = [];
			var series = Math.floor(Math.random()*10)+1;
			for( var i = 0; i<series; i++)
			{
				data[i] = { label: "Series"+(i+1), data: Math.floor(Math.random()*100)+1 }
			}

			$.plot($(".pieChart2"), data, 
			{
				series: {
					pie: { 
						show: true,
						radius:300,
						label: {
							show: true,
							formatter: function(label, series){
								return '<div style="font-size:8pt;text-align:center;padding:2px;color:white;">'+label+'<br/>'+Math.round(series.percent)+'%</div>';
							},
							threshold: 0.1
						}
					}
				},
				legend: {
					show: false
				}
			});


		});
	}

	//------------- Wysiwyg Editor -------------//

	$('.htmlEditor').elrte({cssClass: 'el-rte', height   : 250, toolbar  : 'complete'});

	//------------- Elastic textarea -------------//

	if ($('textarea').hasClass('elastic')) {
		$('.elastic').elastic();
	}

	//------------- Input limiter -------------//

	$('.limiter').inputlimiter();

	//------------- Tags -------------//
	// Local Source

		var localJSON = [
			{ "id": "1", "label": "Hazel Grouse", "value": "Hazel Grouse" },
			{ "id": "2", "label": "Common Quail",	"value": "Common Quail" },
			{ "id": "3", "label": "Greylag Goose", "value": "Greylag Goose" }
		];				
		$('input.tag').tagedit({
			autocompleteOptions: {
				source: localJSON
			}
		});

	//------------- Multi select with filter -------------//

	$(".select").chosen();
	
	//--------------- Dual multi select ------------------//
	
	$.configureBoxes();

	//--------------- Masked input fields ------------------//

	$("#date").mask("99/99/9999");
    $("#phone").mask("(999) 999-9999");
    $("#phone1").mask("(999) 999-9999? x99999");
    $("#taxId").mask("99-9999999");
    $("#ssn").mask("999-99-9999");

    //--------------- Spinner ui ------------------//

    $('#spinner').spinner();
    $('#spinnerStep').spinner({stepping:5});
    $('#spinnerCurrency').spinner({currency:'$'});
    $('#spinnerDecimals').spinner({decimals:2, stepping: 0.12});

    //--------------- Form wizzard ------------------//

    $("#signupForm").formToWizard({ submitButton: 'registerAccount' })

    //--------------- Form validation ------------------//

    $("#form").validate({
    	rules: {
			required: "required",
			required1: {
				required: true,
				minlength: 4
			},
			password: {
				required: true,
				minlength: 5
			},
			confirm_password: {
				required: true,
				minlength: 5,
				equalTo: "#password"
			},
			email: {
				required: true,
				email: true
			},
			maxLenght: {
				required: true,
      			maxlength: 10
			},
			rangelenght: {
		      required: true,
		      rangelength: [10, 20]
		    },
		    minval: {
		      required: true,
		      min: 13
		    },
		    maxval: {
		      required: true,
		      max: 13
		    },
		    range: {
		      required: true,
		      range: [5, 10]
		    },
		    url: {
		      required: true,
		      url: true
		    },
		    date: {
		      required: true,
		      date: true
		    },
		    number: {
		      required: true,
		      number: true
		    },
		    digits: {
		      required: true,
		      digits: true
		    },
		    ccard: {
		      required: true,
		      creditcard: true
		    },
			agree: "required"
		},
		messages: {
			required: "Please enter a something",
			required1: {
				required: "This field is required",
				minlength: "This field must consist of at least 4 characters"
			},
			password: {
				required: "Please provide a password",
				minlength: "Your password must be at least 5 characters long"
			},
			confirm_password: {
				required: "Please provide a password",
				minlength: "Your password must be at least 5 characters long",
				equalTo: "Please enter the same password as above"
			},
			email: "Please enter a valid email address",
			agree: "Please accept our policy"
		}	
    });

	//------------- Placeholder -------------//

	$('input').defaultValue();

	//------------- Tables -------------//

	//Static table hover efect
	$('.staticTable>tbody>tr').hover(
	  function () {
	  	$(this).addClass('hover');
	  }, 
	  function () {
	    $(this).removeClass('hover');
	 });

	//Dynamic table with pagination
	$('.dynamicTable').dataTable( {
		"sPaginationType": "full_numbers"
	} );

	//Dynamic table with column filter add-on reordering
	$('#dynamicTableRowReorder').dataTable( {
		"sPaginationType": "full_numbers"
	} ).columnFilter();

	//Dynamic table with colum reordering and resizing
	$('.dynamicTableResize').dataTable( {
		"sPaginationType": "full_numbers",
		"sDom": "Rlfrtip"
	} );

	//------------- Php upload -------------//
	// Setup html4 version
	$("#html4_uploader").pluploadQueue({
		// General settings
		runtimes : 'html4', 
		url : 'php/upload.php',
		max_file_size : '10mb',
		max_file_count: 15, // user can add no more then 15 files at a time
		chunk_size : '1mb',
		unique_names : true,
		multiple_queues : true,

		// Resize images on clientside if we can
		resize : {width : 320, height : 240, quality : 80},
		
		// Rename files by clicking on their titles
		rename: true,
		
		// Sort files
		sortable: true,

		// Specify what files to browse for
		filters : [
			{title : "Image files", extensions : "jpg,gif,png"},
			{title : "Zip files", extensions : "zip,avi"}
		]
	});

	//------------- Elfinder file manager -------------//
	$("#finder").elfinder({
		url : 'php/connector.php', 
		lang : 'en',
		docked : true
	});

	//------------- Tipsy tooltips -------------//

	$('.tooltips') .tipsy({title: 'title', opacity: 1});
	$('.tooltip.northWest') .tipsy({gravity: 'se', title: 'title', opacity: 1});
	$('.tooltip.north') .tipsy({gravity: 's', title: 'title', opacity: 1});
	$('.tooltip.northEast') .tipsy({gravity: 'sw', title: 'title', opacity: 1});
	$('.tooltip.west') .tipsy({gravity: 'e', title: 'title', opacity: 1});
	$('.tooltip.east') .tipsy({gravity: 'w', title: 'title', opacity: 1});
	$('.tooltip.southWest') .tipsy({gravity: 'ne', title: 'title', opacity: 1});
	$('.tooltip.south') .tipsy({gravity: 'n', title: 'title', opacity: 1});
	$('.tooltip.southEast') .tipsy({gravity: 'nw', title: 'title', opacity: 1});
	
	$('.icons>li>span') .tipsy({title: 'class', opacity: 1});
	$('.tblAction>a').tipsy({gravity: 's',title: 'title', opacity: 1});


	//------------- Notify message -------------//
	$(".nMessage") .click(function() {
 		/*$(this).remove();*/
 		$(this).fadeOut(200);
	});

	//------------- Progress bars -------------//
	
	// default mode
    $('#progress1').anim_progressbar();

    // from second #5 till 15
    var iNow = new Date().setTime(new Date().getTime() + 5 * 1000); // now plus 5 secs
    var iEnd = new Date().setTime(new Date().getTime() + 15 * 1000); // now plus 15 secs
    $('#progress2').anim_progressbar({start: iNow, finish: iEnd, interval: 100});

    // we will just set interval of updating to 2 sec
    $('#progress3').anim_progressbar({interval: 2000});

    // we will just set interval of updating to 5 sec
    $('#progress4').anim_progressbar({interval: 5000});
	
	// jQuery progress bar
	$( "#progress" ).progressbar({
			value: 50
	});

	//------------- Sliders -------------//
	/* basic slider */
	$( ".slider" ).slider();

	/* Range slider */
	$( ".rangeSlider" ).slider({ 
		range: true,
		min: 0,
		max: 200,
		values: [ 75, 100 ],
		slide: function( event, ui ) {
			$( "#rangeValues" ).val(ui.values[ 0 ] + " - " + ui.values[ 1 ] );
		}
	});
	$( "#rangeValues" ).val( $( ".rangeSlider" ).slider( "values", 0 ) +" - " + $( ".rangeSlider" ).slider( "values", 1 ));
	
	/* Slider with minimum value */
	$( ".minSlider" ).slider({ 
		range: "min",
		value: 50,
		min: 1,
		max: 500,
		slide: function( event, ui ) {
			$( "#minValues" ).val( ui.value );
		}
	});
	$( "#minValues" ).val( $( ".minSlider" ).slider( "value" ) );
	
	/* Slider with maximum value*/
	$( ".maxSlider" ).slider({ 
		range: "max",
		min: 1,
		max: 200,
		value: 50,
		slide: function( event, ui ) {
			$( "#maxValues" ).val( ui.value );
		}
	});
	$( "#maxValues" ).val( $( ".maxSlider" ).slider( "value" ) );	
	
	//------------- xBreadcrumbs -------------//
    $('#breadcrumbs-1').xBreadcrumbs();
    $('#breadcrumbs-2').xBreadcrumbs({ collapsible: true });
    $('#breadcrumbs-3').xBreadcrumbs();

    //------------- Gallery effects -------------//
    $('ul.gallery li img').adipoli({
	    'startEffect' : 'normal',
	    'hoverEffect' : 'popout'
	});

	$("ul.gallery li").hover(
		function() { $(this).children(".actionBtn").show("fade", 200); },
		function() { $(this).children(".actionBtn").hide("fade", 200); }
	);
	$("ul.gallery1 li").hover(
		function() { $(this).children(".actionBtn").show("fade", 200); },
		function() { $(this).children(".actionBtn").hide("fade", 200); }
	);

	$('ul.gallery1 li img').adipoli({
	    'startEffect' : 'normal',
	    'hoverEffect' : 'sliceUp'
	});

	$(".gallery a[rel^='prettyPhoto']").prettyPhoto({animation_speed:'fast',theme:'facebook',social_tools:'false'});
	$(".gallery1 a[rel^='prettyPhoto']").prettyPhoto({animation_speed:'fast',theme:'facebook', social_tools:'false'});

	//------------- Colorpicker -------------//
	$('#colorpicker').ColorPicker({flat: true});
	$('#colorpicker1').ColorPicker({
		color: '#dadee2',
		onShow: function (colpkr) {
			$(colpkr).fadeIn(500);
			return false;
		},
		onHide: function (colpkr) {
			$(colpkr).fadeOut(500);
			return false;
		},
		onChange: function (hsb, hex, rgb) {
			$('#colorpicker1').css('backgroundColor', '#' + hex);
		}
	});

	//------------- Datepicker -------------//
	$(".datepicker").datepicker({showOtherMonths:true});
	$(".datepickerMultiple").datepicker({showOtherMonths:true, numberOfMonths:3});

	//-------------Timepicker -------------//
	$('#timepicker').timepicker();

	//-------------Masonry plugin to order boxs -------------//

    var $container = $('#mas');

	$container.imagesLoaded( function(){
	  $container.masonry({
	    itemSelector : '.item',
	     isAnimated: true,
	     columnWidth: function( containerWidth ) {
        return containerWidth / 12;
      	}
	  });
	});

});