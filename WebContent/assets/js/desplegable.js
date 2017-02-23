   var menu = $("ul.dropdown");  
      
    //control de eventos  
    $(this.document).ready(function(){
    	hideOptions(menu);
        menu.mouseover(function(){  
            displayOptions($(this).find("li"));  
        });  
        menu.mouseout(function(){  
            hideOptions($(this));  
        });  
    })  
      
    //funcion que MUESTRA todos los elementos del menu  
    function displayOptions(e){  
        e.show();  
    }  
    //funcion que OCULTA los elementos del menu  
    function hideOptions(e){  
        e.find("li").hide();  
        e.find("li.active").show();  
    }