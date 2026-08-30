-module(openapi_campaign_ad_preview_create).

-export([encode/1]).

-export_type([openapi_campaign_ad_preview_create/0]).

-type openapi_campaign_ad_preview_create() ::
    #{ 'ad_group_id' := binary()
     }.

encode(#{ 'ad_group_id' := AdGroupId
        }) ->
    #{ 'ad_group_id' => AdGroupId
     }.
