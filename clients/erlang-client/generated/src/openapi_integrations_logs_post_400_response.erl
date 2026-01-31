-module(openapi_integrations_logs_post_400_response).

-export([encode/1]).

-export_type([openapi_integrations_logs_post_400_response/0]).

-type openapi_integrations_logs_post_400_response() ::
    #{ 'code' := integer(),
       'message' := binary(),
       'details' := maps:map()
     }.

encode(#{ 'code' := Code,
          'message' := Message,
          'details' := Details
        }) ->
    #{ 'code' => Code,
       'message' => Message,
       'details' => Details
     }.
