-module(openapi_ads_analytics_create_async_request).

-include("openapi.hrl").

-export([openapi_ads_analytics_create_async_request/0]).

-export([openapi_ads_analytics_create_async_request/1]).

-export_type([openapi_ads_analytics_create_async_request/0]).

-type openapi_ads_analytics_create_async_request() ::
  [ {'start_date', binary() }
  | {'end_date', binary() }
  | {'granularity', openapi_granularity:openapi_granularity() }
  | {'click_window_days', openapi_conversion_attribution_window_days:openapi_conversion_attribution_window_days() }
  | {'engagement_window_days', openapi_conversion_attribution_window_days:openapi_conversion_attribution_window_days() }
  | {'view_window_days', openapi_conversion_attribution_window_days:openapi_conversion_attribution_window_days() }
  | {'conversion_report_time', openapi_conversion_report_time_type:openapi_conversion_report_time_type() }
  | {'attribution_types', list(openapi_conversion_report_attribution_type:openapi_conversion_report_attribution_type()) }
  | {'campaign_ids', list(binary()) }
  | {'campaign_statuses', list(openapi_campaign_summary_status:openapi_campaign_summary_status()) }
  | {'campaign_objective_types', list(openapi_objective_type:openapi_objective_type()) }
  | {'ad_group_ids', list(binary()) }
  | {'ad_group_statuses', list(openapi_ad_group_summary_status:openapi_ad_group_summary_status()) }
  | {'ad_ids', list(binary()) }
  | {'ad_statuses', list(openapi_pin_promotion_summary_status:openapi_pin_promotion_summary_status()) }
  | {'product_group_ids', list(binary()) }
  | {'product_group_statuses', list(openapi_product_group_summary_status:openapi_product_group_summary_status()) }
  | {'product_item_ids', list(binary()) }
  | {'targeting_types', list(openapi_ads_analytics_targeting_type:openapi_ads_analytics_targeting_type()) }
  | {'metrics_filters', list(openapi_ads_analytics_metrics_filter:openapi_ads_analytics_metrics_filter()) }
  | {'columns', list(openapi_reporting_column_async:openapi_reporting_column_async()) }
  | {'level', openapi_metrics_reporting_level:openapi_metrics_reporting_level() }
  | {'report_format', openapi_data_output_format:openapi_data_output_format() }
  | {'primary_sort', binary() }
  | {'start_hour', integer() }
  | {'end_hour', integer() }
  ].


openapi_ads_analytics_create_async_request() ->
    openapi_ads_analytics_create_async_request([]).

openapi_ads_analytics_create_async_request(Fields) ->
  Default = [ {'start_date', binary() }
            , {'end_date', binary() }
            , {'granularity', openapi_granularity:openapi_granularity() }
            , {'click_window_days', openapi_conversion_attribution_window_days:openapi_conversion_attribution_window_days() }
            , {'engagement_window_days', openapi_conversion_attribution_window_days:openapi_conversion_attribution_window_days() }
            , {'view_window_days', openapi_conversion_attribution_window_days:openapi_conversion_attribution_window_days() }
            , {'conversion_report_time', openapi_conversion_report_time_type:openapi_conversion_report_time_type() }
            , {'attribution_types', list(openapi_conversion_report_attribution_type:openapi_conversion_report_attribution_type()) }
            , {'campaign_ids', list(binary(), 1, 500) }
            , {'campaign_statuses', list(openapi_campaign_summary_status:openapi_campaign_summary_status(), 1, 6) }
            , {'campaign_objective_types', list(openapi_objective_type:openapi_objective_type(), 1, 7) }
            , {'ad_group_ids', list(binary(), 1, 500) }
            , {'ad_group_statuses', list(openapi_ad_group_summary_status:openapi_ad_group_summary_status(), 1, 6) }
            , {'ad_ids', list(binary(), 1, 500) }
            , {'ad_statuses', list(openapi_pin_promotion_summary_status:openapi_pin_promotion_summary_status(), 1, 6) }
            , {'product_group_ids', list(binary(), 1, 500) }
            , {'product_group_statuses', list(openapi_product_group_summary_status:openapi_product_group_summary_status(), 1, 6) }
            , {'product_item_ids', list(binary(), 1, 500) }
            , {'targeting_types', list(openapi_ads_analytics_targeting_type:openapi_ads_analytics_targeting_type(), 1, 5) }
            , {'metrics_filters', list(openapi_ads_analytics_metrics_filter:openapi_ads_analytics_metrics_filter(), 1) }
            , {'columns', list(openapi_reporting_column_async:openapi_reporting_column_async()) }
            , {'level', openapi_metrics_reporting_level:openapi_metrics_reporting_level() }
            , {'report_format', openapi_data_output_format:openapi_data_output_format() }
            , {'primary_sort', elements([<<"BY_ID">>, <<"BY_DATE">>]) }
            , {'start_hour', integer(0, 23) }
            , {'end_hour', integer(0, 23) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

