-module(openapi_template_based_report_create).

-include("openapi.hrl").

-export([openapi_template_based_report_create/0]).

-export([openapi_template_based_report_create/1]).

-export_type([openapi_template_based_report_create/0]).

-type openapi_template_based_report_create() ::
  [ {'message', binary() }
  | {'report_status', openapi_bulk_reporting_job_status:openapi_bulk_reporting_job_status() }
  | {'token', binary() }
  ].


openapi_template_based_report_create() ->
    openapi_template_based_report_create([]).

openapi_template_based_report_create(Fields) ->
  Default = [ {'message', binary() }
            , {'report_status', openapi_bulk_reporting_job_status:openapi_bulk_reporting_job_status() }
            , {'token', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

