-module(openapi_integration_log_client_request).

-export([encode/1]).

-export_type([openapi_integration_log_client_request/0]).

-type openapi_integration_log_client_request() ::
    #{ 'method' := binary(),
       'host' := binary(),
       'path' := binary(),
       'request_headers' => maps:map(),
       'response_headers' => maps:map(),
       'response_status_code' => integer()
     }.

encode(#{ 'method' := Method,
          'host' := Host,
          'path' := Path,
          'request_headers' := RequestHeaders,
          'response_headers' := ResponseHeaders,
          'response_status_code' := ResponseStatusCode
        }) ->
    #{ 'method' => Method,
       'host' => Host,
       'path' => Path,
       'request_headers' => RequestHeaders,
       'response_headers' => ResponseHeaders,
       'response_status_code' => ResponseStatusCode
     }.
