-module(openapi_bulk_job_data).

-include("openapi.hrl").

-export([openapi_bulk_job_data/0]).

-export([openapi_bulk_job_data/1]).

-export_type([openapi_bulk_job_data/0]).

-type openapi_bulk_job_data() ::
  [ {'result_url', binary() }
  | {'status', openapi_bulk_request_status:openapi_bulk_request_status() }
  | {'workload_id', integer() }
  ].


openapi_bulk_job_data() ->
    openapi_bulk_job_data([]).

openapi_bulk_job_data(Fields) ->
  Default = [ {'result_url', binary() }
            , {'status', openapi_bulk_request_status:openapi_bulk_request_status() }
            , {'workload_id', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

