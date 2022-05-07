-module(openapi_board_section).

-export([encode/1]).

-export_type([openapi_board_section/0]).

-type openapi_board_section() ::
    #{ 'id' => binary(),
       'name' => binary()
     }.

encode(#{ 'id' := Id,
          'name' := Name
        }) ->
    #{ 'id' => Id,
       'name' => Name
     }.
