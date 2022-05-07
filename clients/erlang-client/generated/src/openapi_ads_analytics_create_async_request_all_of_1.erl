-module(openapi_ads_analytics_create_async_request_all_of_1).

-export([encode/1]).

-export_type([openapi_ads_analytics_create_async_request_all_of_1/0]).

-type openapi_ads_analytics_create_async_request_all_of_1() ::
    #{ 'columns' := list(),
       'level' := openapi_metrics_reporting_level:openapi_metrics_reporting_level(),
       'report_format' => openapi_data_output_format:openapi_data_output_format()
     }.

encode(#{ 'columns' := Columns,
          'level' := Level,
          'report_format' := ReportFormat
        }) ->
    #{ 'columns' => Columns,
       'level' => Level,
       'report_format' => ReportFormat
     }.
