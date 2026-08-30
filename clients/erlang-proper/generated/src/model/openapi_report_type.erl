-module(openapi_report_type).

-include("openapi.hrl").

-export([openapi_report_type/0]).

-export_type([openapi_report_type/0]).

-type openapi_report_type() ::
  binary().

openapi_report_type() ->
  elements([<<"SYNC">>, <<"ASYNC">>]).

