-module(openapi_board).

-export([encode/1]).

-export_type([openapi_board/0]).

-type openapi_board() ::
    #{ 'id' => binary(),
       'name' := binary(),
       'description' => binary(),
       'owner' => openapi_board_owner:openapi_board_owner(),
       'privacy' => binary()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'description' := Description,
          'owner' := Owner,
          'privacy' := Privacy
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'description' => Description,
       'owner' => Owner,
       'privacy' => Privacy
     }.
