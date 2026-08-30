-module(openapi_campaign_ad_preview_delete_200_response_inner).

-export([encode/1]).

-export_type([openapi_campaign_ad_preview_delete_200_response_inner/0]).

-type openapi_campaign_ad_preview_delete_200_response_inner() ::
    #{ 'status' := openapi_campaign_ad_preview_delete_200_response_inner_status:openapi_campaign_ad_preview_delete_200_response_inner_status()
     }.

encode(#{ 'status' := Status
        }) ->
    #{ 'status' => Status
     }.
