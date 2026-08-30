-module(openapi_conversion_product_report).

-export([encode/1]).

-export_type([openapi_conversion_product_report/0]).

-type openapi_conversion_product_report() ::
    #{ 'message' => binary(),
       'report_status' => openapi_bulk_reporting_job_status:openapi_bulk_reporting_job_status(),
       'size' => integer(),
       'token' => binary(),
       'url' => binary()
     }.

encode(#{ 'message' := Message,
          'report_status' := ReportStatus,
          'size' := Size,
          'token' := Token,
          'url' := Url
        }) ->
    #{ 'message' => Message,
       'report_status' => ReportStatus,
       'size' => Size,
       'token' => Token,
       'url' => Url
     }.
