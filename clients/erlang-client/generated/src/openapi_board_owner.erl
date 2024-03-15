-module(openapi_board_owner).

-export([encode/1]).

-export_type([openapi_board_owner/0]).

-type openapi_board_owner() ::
    #{ 'username' => binary()
     }.

encode(#{ 'username' := Username
        }) ->
    #{ 'username' => Username
     }.
