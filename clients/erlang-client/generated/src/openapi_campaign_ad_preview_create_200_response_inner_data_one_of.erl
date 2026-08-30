-module(openapi_campaign_ad_preview_create_200_response_inner_data_one_of).

-export([encode/1]).

-export_type([openapi_campaign_ad_preview_create_200_response_inner_data_one_of/0]).

-type openapi_campaign_ad_preview_create_200_response_inner_data_one_of() ::
    #{ 'exceptions' := openapi_pinterest_lib_error:openapi_pinterest_lib_error()
     }.

encode(#{ 'exceptions' := Exceptions
        }) ->
    #{ 'exceptions' => Exceptions
     }.
