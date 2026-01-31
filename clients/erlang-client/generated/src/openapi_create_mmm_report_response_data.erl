-module(openapi_create_mmm_report_response_data).

-export([encode/1]).

-export_type([openapi_create_mmm_report_response_data/0]).

-type openapi_create_mmm_report_response_data() ::
    #{ 'message' => binary(),
       'report_status' => openapi_bulk_reporting_job_status:openapi_bulk_reporting_job_status(),
       'status' => binary(),
       'token' => binary()
     }.

encode(#{ 'message' := Message,
          'report_status' := ReportStatus,
          'status' := Status,
          'token' := Token
        }) ->
    #{ 'message' => Message,
       'report_status' => ReportStatus,
       'status' => Status,
       'token' => Token
     }.
