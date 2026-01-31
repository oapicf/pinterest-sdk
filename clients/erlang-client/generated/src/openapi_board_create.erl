-module(openapi_board_create).

-export([encode/1]).

-export_type([openapi_board_create/0]).

-type openapi_board_create() ::
    #{ 'description' => binary(),
       'is_ads_only' => boolean(),
       'name' := binary(),
       'privacy' => openapi_board_privacy:openapi_board_privacy()
     }.

encode(#{ 'description' := Description,
          'is_ads_only' := IsAdsOnly,
          'name' := Name,
          'privacy' := Privacy
        }) ->
    #{ 'description' => Description,
       'is_ads_only' => IsAdsOnly,
       'name' => Name,
       'privacy' => Privacy
     }.
