-module(openapi_campaign_ad_preview_create_200_response_inner).

-export([encode/1]).

-export_type([openapi_campaign_ad_preview_create_200_response_inner/0]).

-type openapi_campaign_ad_preview_create_200_response_inner() ::
    #{ 'data' := openapi_campaign_ad_preview_create_200_response_inner_data:openapi_campaign_ad_preview_create_200_response_inner_data()
     }.

encode(#{ 'data' := Data
        }) ->
    #{ 'data' => Data
     }.
