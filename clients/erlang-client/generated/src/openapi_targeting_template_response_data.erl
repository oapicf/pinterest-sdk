-module(openapi_targeting_template_response_data).

-export([encode/1]).

-export_type([openapi_targeting_template_response_data/0]).

-type openapi_targeting_template_response_data() ::
    #{ 'auto_targeting_enabled' => boolean(),
       'keywords' => list(),
       'name' => binary(),
       'placement_group' => openapi_placement_group_type:openapi_placement_group_type(),
       'targeting_attributes' => openapi_targeting_spec:openapi_targeting_spec(),
       'tracking_urls' => openapi_tracking_urls:openapi_tracking_urls(),
       'ad_account_id' => binary(),
       'created_time' => integer(),
       'id' => binary(),
       'sizing' => openapi_targeting_template_audience_sizing:openapi_targeting_template_audience_sizing(),
       'status' => binary(),
       'updated_time' => integer()
     }.

encode(#{ 'auto_targeting_enabled' := AutoTargetingEnabled,
          'keywords' := Keywords,
          'name' := Name,
          'placement_group' := PlacementGroup,
          'targeting_attributes' := TargetingAttributes,
          'tracking_urls' := TrackingUrls,
          'ad_account_id' := AdAccountId,
          'created_time' := CreatedTime,
          'id' := Id,
          'sizing' := Sizing,
          'status' := Status,
          'updated_time' := UpdatedTime
        }) ->
    #{ 'auto_targeting_enabled' => AutoTargetingEnabled,
       'keywords' => Keywords,
       'name' => Name,
       'placement_group' => PlacementGroup,
       'targeting_attributes' => TargetingAttributes,
       'tracking_urls' => TrackingUrls,
       'ad_account_id' => AdAccountId,
       'created_time' => CreatedTime,
       'id' => Id,
       'sizing' => Sizing,
       'status' => Status,
       'updated_time' => UpdatedTime
     }.
