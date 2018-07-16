$(window).bind('scroll', function(){    //绑定滚动事件
    var win_height=$(window).height();
    var doc_height=$(document).height();
    var scroll_top=$(document).scrollTop();

    if(scroll_top > 0){
        $('#xiao-top').addClass("xiao-top-two");
    }else if($('#xiao-top').hasClass('xiao-top-two') && scroll_top == 0){
        $('#xiao-top').removeClass("xiao-top-two");
        
    }

    if($(document).scrollTop() + $(window).height() >= $(document).height()){
        // 到达底部
        // console.log(win_height);
        // console.log($(document).scrollTop());
        // console.log(doc_height);
        //......
    }
});    