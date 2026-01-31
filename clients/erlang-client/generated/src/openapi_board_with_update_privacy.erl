-module(openapi_board_with_update_privacy).

-export([encode/1]).

-export_type([openapi_board_with_update_privacy/0]).

-type openapi_board_with_update_privacy() ::
    #{ 'board_pins_modified_at' => openapi_date_time:openapi_date_time(),
       'collaborator_count' => integer(),
       'created_at' => openapi_date_time:openapi_date_time(),
       'description' => binary(),
       'follower_count' => integer(),
       'id' := binary(),
       'is_ads_only' => boolean(),
       'media' => openapi_board_media:openapi_board_media(),
       'name' := binary(),
       'owner' => openapi_board_owner:openapi_board_owner(),
       'pin_count' => integer(),
       'privacy' => openapi_board_update_privacy:openapi_board_update_privacy()
     }.

encode(#{ 'board_pins_modified_at' := BoardPinsModifiedAt,
          'collaborator_count' := CollaboratorCount,
          'created_at' := CreatedAt,
          'description' := Description,
          'follower_count' := FollowerCount,
          'id' := Id,
          'is_ads_only' := IsAdsOnly,
          'media' := Media,
          'name' := Name,
          'owner' := Owner,
          'pin_count' := PinCount,
          'privacy' := Privacy
        }) ->
    #{ 'board_pins_modified_at' => BoardPinsModifiedAt,
       'collaborator_count' => CollaboratorCount,
       'created_at' => CreatedAt,
       'description' => Description,
       'follower_count' => FollowerCount,
       'id' => Id,
       'is_ads_only' => IsAdsOnly,
       'media' => Media,
       'name' => Name,
       'owner' => Owner,
       'pin_count' => PinCount,
       'privacy' => Privacy
     }.
