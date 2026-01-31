-module(openapi_targeting_template_create).

-export([encode/1]).

-export_type([openapi_targeting_template_create/0]).

-type openapi_targeting_template_create() ::
    #{ 'auto_targeting_enabled' => boolean(),
       'keywords' => list(),
       'name' := binary(),
       'placement_group' => openapi_placement_group_type:openapi_placement_group_type(),
       'targeting_attributes' := openapi_targeting_spec:openapi_targeting_spec(),
       'tracking_urls' => openapi_tracking_urls:openapi_tracking_urls()
     }.

encode(#{ 'auto_targeting_enabled' := AutoTargetingEnabled,
          'keywords' := Keywords,
          'name' := Name,
          'placement_group' := PlacementGroup,
          'targeting_attributes' := TargetingAttributes,
          'tracking_urls' := TrackingUrls
        }) ->
    #{ 'auto_targeting_enabled' => AutoTargetingEnabled,
       'keywords' => Keywords,
       'name' => Name,
       'placement_group' => PlacementGroup,
       'targeting_attributes' => TargetingAttributes,
       'tracking_urls' => TrackingUrls
     }.
