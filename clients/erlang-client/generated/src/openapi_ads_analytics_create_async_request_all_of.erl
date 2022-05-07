-module(openapi_ads_analytics_create_async_request_all_of).

-export([encode/1]).

-export_type([openapi_ads_analytics_create_async_request_all_of/0]).

-type openapi_ads_analytics_create_async_request_all_of() ::
    #{ 'start_date' := binary(),
       'end_date' := binary(),
       'granularity' := openapi_granularity:openapi_granularity(),
       'click_window_days' => openapi_conversion_attribution_window_days:openapi_conversion_attribution_window_days(),
       'engagement_window_days' => openapi_conversion_attribution_window_days:openapi_conversion_attribution_window_days(),
       'view_window_days' => openapi_conversion_attribution_window_days:openapi_conversion_attribution_window_days(),
       'conversion_report_time' => openapi_conversion_report_time_type:openapi_conversion_report_time_type(),
       'attribution_types' => list()
     }.

encode(#{ 'start_date' := StartDate,
          'end_date' := EndDate,
          'granularity' := Granularity,
          'click_window_days' := ClickWindowDays,
          'engagement_window_days' := EngagementWindowDays,
          'view_window_days' := ViewWindowDays,
          'conversion_report_time' := ConversionReportTime,
          'attribution_types' := AttributionTypes
        }) ->
    #{ 'start_date' => StartDate,
       'end_date' => EndDate,
       'granularity' => Granularity,
       'click_window_days' => ClickWindowDays,
       'engagement_window_days' => EngagementWindowDays,
       'view_window_days' => ViewWindowDays,
       'conversion_report_time' => ConversionReportTime,
       'attribution_types' => AttributionTypes
     }.
