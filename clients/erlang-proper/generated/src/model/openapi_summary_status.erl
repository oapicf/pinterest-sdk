-module(openapi_summary_status).

-include("openapi.hrl").

-export([openapi_summary_status/0]).

-export_type([openapi_summary_status/0]).

-type openapi_summary_status() ::
  binary().

openapi_summary_status() ->
  elements([<<"RUNNING">>, <<"PAUSED">>, <<"NOT_STARTED">>, <<"COMPLETED">>, <<"ADVERTISER_DISABLED">>, <<"ARCHIVED">>, <<"DRAFT">>, <<"DELETED_DRAFT">>]).

