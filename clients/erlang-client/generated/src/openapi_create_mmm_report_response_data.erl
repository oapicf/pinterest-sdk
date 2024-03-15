-module(openapi_create_mmm_report_response_data).

-export([encode/1]).

-export_type([openapi_create_mmm_report_response_data/0]).

-type openapi_create_mmm_report_response_data() ::
    #{ 'report_status' => openapi_bulk_reporting_job_status:openapi_bulk_reporting_job_status(),
       'token' => binary(),
       'message' => binary(),
       'status' => binary()
     }.

encode(#{ 'report_status' := ReportStatus,
          'token' := Token,
          'message' := Message,
          'status' := Status
        }) ->
    #{ 'report_status' => ReportStatus,
       'token' => Token,
       'message' => Message,
       'status' => Status
     }.
