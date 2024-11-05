-module(openapi_leads_export_status).

-include("openapi.hrl").

-export([openapi_leads_export_status/0]).

-export_type([openapi_leads_export_status/0]).

-type openapi_leads_export_status() ::
  binary().

openapi_leads_export_status() ->
  elements([<<"IN_PROGRESS">>, <<"FINISHED">>, <<"FAILED">>]).

