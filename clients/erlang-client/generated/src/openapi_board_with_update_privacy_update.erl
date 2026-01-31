-module(openapi_board_with_update_privacy_update).

-export([encode/1]).

-export_type([openapi_board_with_update_privacy_update/0]).

-type openapi_board_with_update_privacy_update() ::
    #{ 'description' => binary(),
       'name' => binary(),
       'privacy' => openapi_board_update_privacy:openapi_board_update_privacy()
     }.

encode(#{ 'description' := Description,
          'name' := Name,
          'privacy' := Privacy
        }) ->
    #{ 'description' => Description,
       'name' => Name,
       'privacy' => Privacy
     }.
