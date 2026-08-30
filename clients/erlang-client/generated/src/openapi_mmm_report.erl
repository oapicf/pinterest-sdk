-module(openapi_mmm_report).

-export([encode/1]).

-export_type([openapi_mmm_report/0]).

-type openapi_mmm_report() ::
    #{ 'message' => binary(),
       'report_status' => openapi_bulk_reporting_job_status:openapi_bulk_reporting_job_status(),
       'size' => integer(),
       'status' => binary(),
       'token' => binary(),
       'url' => binary()
     }.

encode(#{ 'message' := Message,
          'report_status' := ReportStatus,
          'size' := Size,
          'status' := Status,
          'token' := Token,
          'url' := Url
        }) ->
    #{ 'message' => Message,
       'report_status' => ReportStatus,
       'size' => Size,
       'status' => Status,
       'token' => Token,
       'url' => Url
     }.
