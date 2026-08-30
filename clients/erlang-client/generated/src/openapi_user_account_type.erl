-module(openapi_user_account_type).

-export([encode/1]).

-export_type([openapi_user_account_type/0]).

-type openapi_user_account_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
