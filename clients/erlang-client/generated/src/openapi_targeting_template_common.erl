-module(openapi_targeting_template_common).

-export([encode/1]).

-export_type([openapi_targeting_template_common/0]).

-type openapi_targeting_template_common() ::
    #{ 'name' => binary(),
       'auto_targeting_enabled' => boolean(),
       'targeting_attributes' => openapi_targeting_spec:openapi_targeting_spec(),
       'placement_group' => openapi_placement_group_type:openapi_placement_group_type(),
       'keywords' => list(),
       'tracking_urls' => openapi_tracking_urls:openapi_tracking_urls()
     }.

encode(#{ 'name' := Name,
          'auto_targeting_enabled' := AutoTargetingEnabled,
          'targeting_attributes' := TargetingAttributes,
          'placement_group' := PlacementGroup,
          'keywords' := Keywords,
          'tracking_urls' := TrackingUrls
        }) ->
    #{ 'name' => Name,
       'auto_targeting_enabled' => AutoTargetingEnabled,
       'targeting_attributes' => TargetingAttributes,
       'placement_group' => PlacementGroup,
       'keywords' => Keywords,
       'tracking_urls' => TrackingUrls
     }.
