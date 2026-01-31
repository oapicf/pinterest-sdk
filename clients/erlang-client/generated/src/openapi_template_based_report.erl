-module(openapi_template_based_report).

-export([encode/1]).

-export_type([openapi_template_based_report/0]).

-type openapi_template_based_report() ::
    #{ 'message' => binary(),
       'report_status' := openapi_bulk_reporting_job_status:openapi_bulk_reporting_job_status(),
       'template_id' := binary(),
       'token' => binary()
     }.

encode(#{ 'message' := Message,
          'report_status' := ReportStatus,
          'template_id' := TemplateId,
          'token' := Token
        }) ->
    #{ 'message' => Message,
       'report_status' => ReportStatus,
       'template_id' => TemplateId,
       'token' => Token
     }.
