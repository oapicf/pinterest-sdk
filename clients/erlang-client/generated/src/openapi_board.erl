-module(openapi_board).

-export([encode/1]).

-export_type([openapi_board/0]).

-type openapi_board() ::
    #{ 'id' => binary(),
       'created_at' => openapi_date_time:openapi_date_time(),
       'board_pins_modified_at' => openapi_date_time:openapi_date_time(),
       'name' := binary(),
       'description' => binary(),
       'collaborator_count' => integer(),
       'pin_count' => integer(),
       'follower_count' => integer(),
       'media' => openapi_board_media:openapi_board_media(),
       'owner' => openapi_board_owner:openapi_board_owner(),
       'privacy' => binary()
     }.

encode(#{ 'id' := Id,
          'created_at' := CreatedAt,
          'board_pins_modified_at' := BoardPinsModifiedAt,
          'name' := Name,
          'description' := Description,
          'collaborator_count' := CollaboratorCount,
          'pin_count' := PinCount,
          'follower_count' := FollowerCount,
          'media' := Media,
          'owner' := Owner,
          'privacy' := Privacy
        }) ->
    #{ 'id' => Id,
       'created_at' => CreatedAt,
       'board_pins_modified_at' => BoardPinsModifiedAt,
       'name' => Name,
       'description' => Description,
       'collaborator_count' => CollaboratorCount,
       'pin_count' => PinCount,
       'follower_count' => FollowerCount,
       'media' => Media,
       'owner' => Owner,
       'privacy' => Privacy
     }.
