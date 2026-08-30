-module(openapi_board_section_update_with_required_body).

-export([encode/1]).

-export_type([openapi_board_section_update_with_required_body/0]).

-type openapi_board_section_update_with_required_body() ::
    #{ 'id' => binary(),
       'name' := binary()
     }.

encode(#{ 'id' := Id,
          'name' := Name
        }) ->
    #{ 'id' => Id,
       'name' => Name
     }.
