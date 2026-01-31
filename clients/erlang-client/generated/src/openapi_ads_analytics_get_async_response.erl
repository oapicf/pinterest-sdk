-module(openapi_ads_analytics_get_async_response).

-export([encode/1]).

-export_type([openapi_ads_analytics_get_async_response/0]).

-type openapi_ads_analytics_get_async_response() ::
    #{ 'report_status' => openapi_bulk_reporting_job_status:openapi_bulk_reporting_job_status(),
       'size' => integer(),
       'url' => binary()
     }.

encode(#{ 'report_status' := ReportStatus,
          'size' := Size,
          'url' := Url
        }) ->
    #{ 'report_status' => ReportStatus,
       'size' => Size,
       'url' => Url
     }.
