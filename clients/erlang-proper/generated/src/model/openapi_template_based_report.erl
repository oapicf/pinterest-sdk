-module(openapi_template_based_report).

-include("openapi.hrl").

-export([openapi_template_based_report/0]).

-export([openapi_template_based_report/1]).

-export_type([openapi_template_based_report/0]).

-type openapi_template_based_report() ::
  [ {'message', binary() }
  | {'report_status', openapi_bulk_reporting_job_status:openapi_bulk_reporting_job_status() }
  | {'template_id', binary() }
  | {'token', binary() }
  ].


openapi_template_based_report() ->
    openapi_template_based_report([]).

openapi_template_based_report(Fields) ->
  Default = [ {'message', binary() }
            , {'report_status', openapi_bulk_reporting_job_status:openapi_bulk_reporting_job_status() }
            , {'template_id', binary() }
            , {'token', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

