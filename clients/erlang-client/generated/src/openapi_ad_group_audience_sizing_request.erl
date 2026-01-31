-module(openapi_ad_group_audience_sizing_request).

-export([encode/1]).

-export_type([openapi_ad_group_audience_sizing_request/0]).

-type openapi_ad_group_audience_sizing_request() ::
    #{ 'auto_targeting_enabled' => boolean(),
       'creative_types' => list(),
       'keywords' => list(),
       'placement_group' => openapi_placement_group_type:openapi_placement_group_type(),
       'product_group_ids' => list(),
       'targeting_spec' => openapi_targeting_spec:openapi_targeting_spec()
     }.

encode(#{ 'auto_targeting_enabled' := AutoTargetingEnabled,
          'creative_types' := CreativeTypes,
          'keywords' := Keywords,
          'placement_group' := PlacementGroup,
          'product_group_ids' := ProductGroupIds,
          'targeting_spec' := TargetingSpec
        }) ->
    #{ 'auto_targeting_enabled' => AutoTargetingEnabled,
       'creative_types' => CreativeTypes,
       'keywords' => Keywords,
       'placement_group' => PlacementGroup,
       'product_group_ids' => ProductGroupIds,
       'targeting_spec' => TargetingSpec
     }.
