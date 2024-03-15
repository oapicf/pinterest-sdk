-module(openapi_ad_group_audience_sizing_request).

-export([encode/1]).

-export_type([openapi_ad_group_audience_sizing_request/0]).

-type openapi_ad_group_audience_sizing_request() ::
    #{ 'auto_targeting_enabled' => boolean(),
       'placement_group' => openapi_placement_group_type:openapi_placement_group_type(),
       'creative_types' => list(),
       'targeting_spec' => openapi_targeting_spec:openapi_targeting_spec(),
       'product_group_ids' => list(),
       'keywords' => list()
     }.

encode(#{ 'auto_targeting_enabled' := AutoTargetingEnabled,
          'placement_group' := PlacementGroup,
          'creative_types' := CreativeTypes,
          'targeting_spec' := TargetingSpec,
          'product_group_ids' := ProductGroupIds,
          'keywords' := Keywords
        }) ->
    #{ 'auto_targeting_enabled' => AutoTargetingEnabled,
       'placement_group' => PlacementGroup,
       'creative_types' => CreativeTypes,
       'targeting_spec' => TargetingSpec,
       'product_group_ids' => ProductGroupIds,
       'keywords' => Keywords
     }.
