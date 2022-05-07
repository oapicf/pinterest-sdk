-module(openapi_board_update).

-export([encode/1]).

-export_type([openapi_board_update/0]).

-type openapi_board_update() ::
    #{ 'name' => binary(),
       'description' => binary(),
       'privacy' => binary()
     }.

encode(#{ 'name' := Name,
          'description' := Description,
          'privacy' := Privacy
        }) ->
    #{ 'name' => Name,
       'description' => Description,
       'privacy' => Privacy
     }.
