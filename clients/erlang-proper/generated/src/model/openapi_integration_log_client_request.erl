-module(openapi_integration_log_client_request).

-include("openapi.hrl").

-export([openapi_integration_log_client_request/0]).

-export([openapi_integration_log_client_request/1]).

-export_type([openapi_integration_log_client_request/0]).

-type openapi_integration_log_client_request() ::
  [ {'method', binary() }
  | {'host', binary() }
  | {'path', binary() }
  | {'request_headers', map() }
  | {'response_headers', map() }
  | {'response_status_code', integer() }
  ].


openapi_integration_log_client_request() ->
    openapi_integration_log_client_request([]).

openapi_integration_log_client_request(Fields) ->
  Default = [ {'method', elements([<<"GET">>, <<"HEAD">>, <<"POST">>, <<"PUT">>, <<"DELETE">>, <<"CONNECT">>, <<"OPTIONS">>, <<"TRACE">>, <<"PATCH">>]) }
            , {'host', binary() }
            , {'path', binary() }
            , {'request_headers', map() }
            , {'response_headers', map() }
            , {'response_status_code', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

