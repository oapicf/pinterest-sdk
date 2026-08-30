-module(openapi_template_based_report_create).

-export([encode/1]).

-export_type([openapi_template_based_report_create/0]).

-type openapi_template_based_report_create() ::
    #{ 'message' => binary(),
       'report_status' := openapi_bulk_reporting_job_status:openapi_bulk_reporting_job_status(),
       'token' => binary()
     }.

encode(#{ 'message' := Message,
          'report_status' := ReportStatus,
          'token' := Token
        }) ->
    #{ 'message' => Message,
       'report_status' => ReportStatus,
       'token' => Token
     }.
