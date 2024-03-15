-module(openapi_ads_analytics_create_async_response).

-export([encode/1]).

-export_type([openapi_ads_analytics_create_async_response/0]).

-type openapi_ads_analytics_create_async_response() ::
    #{ 'report_status' => openapi_bulk_reporting_job_status:openapi_bulk_reporting_job_status(),
       'token' => binary(),
       'message' => binary()
     }.

encode(#{ 'report_status' := ReportStatus,
          'token' := Token,
          'message' := Message
        }) ->
    #{ 'report_status' => ReportStatus,
       'token' => Token,
       'message' => Message
     }.
