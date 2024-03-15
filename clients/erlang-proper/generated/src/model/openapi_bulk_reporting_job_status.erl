-module(openapi_bulk_reporting_job_status).

-include("openapi.hrl").

-export([openapi_bulk_reporting_job_status/0]).

-export_type([openapi_bulk_reporting_job_status/0]).

-type openapi_bulk_reporting_job_status() ::
  binary().

openapi_bulk_reporting_job_status() ->
  elements([<<"DOES_NOT_EXIST">>, <<"FINISHED">>, <<"IN_PROGRESS">>, <<"EXPIRED">>, <<"FAILED">>, <<"CANCELLED">>]).

