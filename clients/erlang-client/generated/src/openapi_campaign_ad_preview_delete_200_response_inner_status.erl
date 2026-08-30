-module(openapi_campaign_ad_preview_delete_200_response_inner_status).

-export([encode/1]).

-export_type([openapi_campaign_ad_preview_delete_200_response_inner_status/0]).

-type openapi_campaign_ad_preview_delete_200_response_inner_status() ::
    #{ 'statusCode' := integer(),
       'code' := integer(),
       'message' := binary()
     }.

encode(#{ 'statusCode' := StatusCode,
          'code' := Code,
          'message' := Message
        }) ->
    #{ 'statusCode' => StatusCode,
       'code' => Code,
       'message' => Message
     }.
