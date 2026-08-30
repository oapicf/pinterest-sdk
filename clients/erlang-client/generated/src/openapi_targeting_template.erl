-module(openapi_targeting_template).

-export([encode/1]).

-export_type([openapi_targeting_template/0]).

-type openapi_targeting_template() ::
    #{ 'ad_account_id' => binary(),
       'auto_targeting_enabled' => boolean(),
       'created_time' => integer(),
       'id' => binary(),
       'keywords' => list(),
       'name' := binary(),
       'placement_group' => openapi_placement_group_type:openapi_placement_group_type(),
       'sizing' => openapi_targeting_template_audience_sizing:openapi_targeting_template_audience_sizing(),
       'status' => openapi_targeting_template_status:openapi_targeting_template_status(),
       'targeting_attributes' := openapi_targeting_spec_optimal:openapi_targeting_spec_optimal(),
       'tracking_urls' => openapi_tracking_urls:openapi_tracking_urls(),
       'updated_time' => integer(),
       'valid' => boolean()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'auto_targeting_enabled' := AutoTargetingEnabled,
          'created_time' := CreatedTime,
          'id' := Id,
          'keywords' := Keywords,
          'name' := Name,
          'placement_group' := PlacementGroup,
          'sizing' := Sizing,
          'status' := Status,
          'targeting_attributes' := TargetingAttributes,
          'tracking_urls' := TrackingUrls,
          'updated_time' := UpdatedTime,
          'valid' := Valid
        }) ->
    #{ 'ad_account_id' => AdAccountId,
       'auto_targeting_enabled' => AutoTargetingEnabled,
       'created_time' => CreatedTime,
       'id' => Id,
       'keywords' => Keywords,
       'name' => Name,
       'placement_group' => PlacementGroup,
       'sizing' => Sizing,
       'status' => Status,
       'targeting_attributes' => TargetingAttributes,
       'tracking_urls' => TrackingUrls,
       'updated_time' => UpdatedTime,
       'valid' => Valid
     }.
