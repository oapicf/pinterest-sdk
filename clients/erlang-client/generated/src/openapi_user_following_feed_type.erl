-module(openapi_user_following_feed_type).

-export([encode/1]).

-export_type([openapi_user_following_feed_type/0]).

-type openapi_user_following_feed_type() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
