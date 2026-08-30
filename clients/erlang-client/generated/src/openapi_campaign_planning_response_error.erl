-module(openapi_campaign_planning_response_error).

-export([encode/1]).

-export_type([openapi_campaign_planning_response_error/0]).

-type openapi_campaign_planning_response_error() ::
    #{ 'code' => openapi_campaign_planning_response_error_code:openapi_campaign_planning_response_error_code(),
       'message' => binary()
     }.

encode(#{ 'code' := Code,
          'message' := Message
        }) ->
    #{ 'code' => Code,
       'message' => Message
     }.
