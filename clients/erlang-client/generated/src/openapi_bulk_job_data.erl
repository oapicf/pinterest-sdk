-module(openapi_bulk_job_data).

-export([encode/1]).

-export_type([openapi_bulk_job_data/0]).

-type openapi_bulk_job_data() ::
    #{ 'result_url' => binary(),
       'status' := openapi_bulk_request_status:openapi_bulk_request_status(),
       'workload_id' => integer()
     }.

encode(#{ 'result_url' := ResultUrl,
          'status' := Status,
          'workload_id' := WorkloadId
        }) ->
    #{ 'result_url' => ResultUrl,
       'status' => Status,
       'workload_id' => WorkloadId
     }.
