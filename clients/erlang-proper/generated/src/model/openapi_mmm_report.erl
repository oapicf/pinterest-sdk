-module(openapi_mmm_report).

-include("openapi.hrl").

-export([openapi_mmm_report/0]).

-export([openapi_mmm_report/1]).

-export_type([openapi_mmm_report/0]).

-type openapi_mmm_report() ::
  [ {'message', binary() }
  | {'report_status', openapi_bulk_reporting_job_status:openapi_bulk_reporting_job_status() }
  | {'size', integer() }
  | {'status', binary() }
  | {'token', binary() }
  | {'url', binary() }
  ].


openapi_mmm_report() ->
    openapi_mmm_report([]).

openapi_mmm_report(Fields) ->
  Default = [ {'message', binary() }
            , {'report_status', openapi_bulk_reporting_job_status:openapi_bulk_reporting_job_status() }
            , {'size', integer() }
            , {'status', binary() }
            , {'token', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

