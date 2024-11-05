-module(openapi_targeting_template_get_response_data).

-export([encode/1]).

-export_type([openapi_targeting_template_get_response_data/0]).

-type openapi_targeting_template_get_response_data() ::
    #{ 'name' => binary(),
       'auto_targeting_enabled' => boolean(),
       'targeting_attributes' => openapi_targeting_spec:openapi_targeting_spec(),
       'placement_group' => openapi_placement_group_type:openapi_placement_group_type(),
       'keywords' => list(),
       'tracking_urls' => openapi_tracking_urls:openapi_tracking_urls(),
       'id' => binary(),
       'created_time' => integer(),
       'updated_time' => integer(),
       'ad_account_id' => binary(),
       'status' => binary(),
       'sizing' => openapi_targeting_template_audience_sizing:openapi_targeting_template_audience_sizing(),
       'valid' => boolean()
     }.

encode(#{ 'name' := Name,
          'auto_targeting_enabled' := AutoTargetingEnabled,
          'targeting_attributes' := TargetingAttributes,
          'placement_group' := PlacementGroup,
          'keywords' := Keywords,
          'tracking_urls' := TrackingUrls,
          'id' := Id,
          'created_time' := CreatedTime,
          'updated_time' := UpdatedTime,
          'ad_account_id' := AdAccountId,
          'status' := Status,
          'sizing' := Sizing,
          'valid' := Valid
        }) ->
    #{ 'name' => Name,
       'auto_targeting_enabled' => AutoTargetingEnabled,
       'targeting_attributes' => TargetingAttributes,
       'placement_group' => PlacementGroup,
       'keywords' => Keywords,
       'tracking_urls' => TrackingUrls,
       'id' => Id,
       'created_time' => CreatedTime,
       'updated_time' => UpdatedTime,
       'ad_account_id' => AdAccountId,
       'status' => Status,
       'sizing' => Sizing,
       'valid' => Valid
     }.
