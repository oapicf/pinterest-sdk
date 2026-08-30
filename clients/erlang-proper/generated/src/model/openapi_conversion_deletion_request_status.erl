-module(openapi_conversion_deletion_request_status).

-include("openapi.hrl").

-export([openapi_conversion_deletion_request_status/0]).

-export_type([openapi_conversion_deletion_request_status/0]).

-type openapi_conversion_deletion_request_status() ::
  binary().

openapi_conversion_deletion_request_status() ->
  elements([<<"PENDING">>, <<"SUBMITTED">>, <<"CANCELLED">>]).

