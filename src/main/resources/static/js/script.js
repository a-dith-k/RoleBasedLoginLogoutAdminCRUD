const search=()=>{
    console.log("searching");
    let query=$("#search-input").val();
    console.log(query);

    if(query==""){
        $(".search-result").hide();
    }else{
        console.log(query);

        //sending request to server
        let url='http://localhost:8000/admin/dashboard/search/'+[query];
        fetch(url).then(response=>{
            return response.json();
        }).then((data)=>{
            console.log(data)
            let text='<div class="list-group">';
            data.forEach((user)=>{
                text+='<a href="/admin/single/' + user.id +'" class="list-group-item">' + user.userName + '</a>';
            });

            text+='</div>'

            $(".search-result").html(text);
            $(".search-result").show();

        });

    }
};