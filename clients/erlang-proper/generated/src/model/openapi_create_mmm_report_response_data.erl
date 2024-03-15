-module(openapi_create_mmm_report_response_data).

-include("openapi.hrl").

-export([openapi_create_mmm_report_response_data/0]).

-export([openapi_create_mmm_report_response_data/1]).

-export_type([openapi_create_mmm_report_response_data/0]).

-type openapi_create_mmm_report_response_data() ::
  [ {'report_status', openapi_bulk_reporting_job_status:openapi_bulk_reporting_job_status() }
  | {'token', binary() }
  | {'message', binary() }
  | {'status', binary() }
  ].


openapi_create_mmm_report_response_data() ->
    openapi_create_mmm_report_response_data([]).

openapi_create_mmm_report_response_data(Fields) ->
  Default = [ {'report_status', openapi_bulk_reporting_job_status:openapi_bulk_reporting_job_status() }
            , {'token', binary() }
            , {'message', binary() }
            , {'status', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

