-module(openapi_integration_log_client_request).

-export([encode/1]).

-export_type([openapi_integration_log_client_request/0]).

-type openapi_integration_log_client_request() ::
    #{ 'host' := binary(),
       'method' := binary(),
       'path' := binary(),
       'request_headers' => maps:map(),
       'response_headers' => maps:map(),
       'response_status_code' => integer()
     }.

encode(#{ 'host' := Host,
          'method' := Method,
          'path' := Path,
          'request_headers' := RequestHeaders,
          'response_headers' := ResponseHeaders,
          'response_status_code' := ResponseStatusCode
        }) ->
    #{ 'host' => Host,
       'method' => Method,
       'path' => Path,
       'request_headers' => RequestHeaders,
       'response_headers' => ResponseHeaders,
       'response_status_code' => ResponseStatusCode
     }.
