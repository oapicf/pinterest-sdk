-module(openapi_board_section_create).

-export([encode/1]).

-export_type([openapi_board_section_create/0]).

-type openapi_board_section_create() ::
    #{ 'id' => binary(),
       'name' := binary()
     }.

encode(#{ 'id' := Id,
          'name' := Name
        }) ->
    #{ 'id' => Id,
       'name' => Name
     }.
