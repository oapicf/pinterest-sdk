-module(openapi_ads_analytics_create_async_request).

-include("openapi.hrl").

-export([openapi_ads_analytics_create_async_request/0]).

-export([openapi_ads_analytics_create_async_request/1]).

-export_type([openapi_ads_analytics_create_async_request/0]).

-type openapi_ads_analytics_create_async_request() ::
  [ {'ad_group_ids', list(binary()) }
  | {'ad_group_statuses', list(openapi_ad_group_summary_status:openapi_ad_group_summary_status()) }
  | {'ad_ids', list(binary()) }
  | {'ad_statuses', list(openapi_pin_promotion_summary_status:openapi_pin_promotion_summary_status()) }
  | {'attribution_types', list(openapi_conversion_report_attribution_type:openapi_conversion_report_attribution_type()) }
  | {'campaign_brand_label', binary() }
  | {'campaign_custom_label', binary() }
  | {'campaign_ids', list(binary()) }
  | {'campaign_objective_types', list(openapi_campaign_objective_type:openapi_campaign_objective_type()) }
  | {'campaign_statuses', list(openapi_campaign_summary_status:openapi_campaign_summary_status()) }
  | {'click_window_days', openapi_conversion_attribution_window_days:openapi_conversion_attribution_window_days() }
  | {'columns', list(openapi_reporting_column_async:openapi_reporting_column_async()) }
  | {'combine_targeting_types', boolean() }
  | {'conversion_report_time', openapi_conversion_report_time_type:openapi_conversion_report_time_type() }
  | {'custom_conversion_event_metrics', list(openapi_custom_conversion_event_metrics:openapi_custom_conversion_event_metrics()) }
  | {'end_date', binary() }
  | {'end_hour', integer() }
  | {'engagement_window_days', openapi_conversion_attribution_window_days:openapi_conversion_attribution_window_days() }
  | {'granularity', openapi_granularity:openapi_granularity() }
  | {'level', openapi_metrics_reporting_level:openapi_metrics_reporting_level() }
  | {'metrics_filters', list(openapi_ads_analytics_metrics_filter:openapi_ads_analytics_metrics_filter()) }
  | {'primary_sort', openapi_primary_sort:openapi_primary_sort() }
  | {'product_group_ids', list(binary()) }
  | {'product_group_statuses', list(openapi_product_group_summary_status:openapi_product_group_summary_status()) }
  | {'product_item_ids', list(binary()) }
  | {'report_format', openapi_data_output_format:openapi_data_output_format() }
  | {'reporting_timezone', openapi_reporting_time_zone:openapi_reporting_time_zone() }
  | {'start_date', binary() }
  | {'start_hour', integer() }
  | {'targeting_types', list(openapi_ad_ads_analytics_async_targeting_types:openapi_ad_ads_analytics_async_targeting_types()) }
  | {'view_window_days', openapi_conversion_attribution_window_days:openapi_conversion_attribution_window_days() }
  ].


openapi_ads_analytics_create_async_request() ->
    openapi_ads_analytics_create_async_request([]).

openapi_ads_analytics_create_async_request(Fields) ->
  Default = [ {'ad_group_ids', list(binary(), 1, 500) }
            , {'ad_group_statuses', list(openapi_ad_group_summary_status:openapi_ad_group_summary_status(), 1, 6) }
            , {'ad_ids', list(binary(), 1, 500) }
            , {'ad_statuses', list(openapi_pin_promotion_summary_status:openapi_pin_promotion_summary_status(), 1, 6) }
            , {'attribution_types', list(openapi_conversion_report_attribution_type:openapi_conversion_report_attribution_type()) }
            , {'campaign_brand_label', binary() }
            , {'campaign_custom_label', binary() }
            , {'campaign_ids', list(binary(), 1, 500) }
            , {'campaign_objective_types', list(openapi_campaign_objective_type:openapi_campaign_objective_type(), 1, 7) }
            , {'campaign_statuses', list(openapi_campaign_summary_status:openapi_campaign_summary_status(), 1, 6) }
            , {'click_window_days', openapi_conversion_attribution_window_days:openapi_conversion_attribution_window_days() }
            , {'columns', list(openapi_reporting_column_async:openapi_reporting_column_async()) }
            , {'combine_targeting_types', boolean() }
            , {'conversion_report_time', openapi_conversion_report_time_type:openapi_conversion_report_time_type() }
            , {'custom_conversion_event_metrics', list(openapi_custom_conversion_event_metrics:openapi_custom_conversion_event_metrics()) }
            , {'end_date', binary() }
            , {'end_hour', integer(0, 23) }
            , {'engagement_window_days', openapi_conversion_attribution_window_days:openapi_conversion_attribution_window_days() }
            , {'granularity', openapi_granularity:openapi_granularity() }
            , {'level', openapi_metrics_reporting_level:openapi_metrics_reporting_level() }
            , {'metrics_filters', list(openapi_ads_analytics_metrics_filter:openapi_ads_analytics_metrics_filter(), 1) }
            , {'primary_sort', openapi_primary_sort:openapi_primary_sort() }
            , {'product_group_ids', list(binary(), 1, 500) }
            , {'product_group_statuses', list(openapi_product_group_summary_status:openapi_product_group_summary_status(), 1, 6) }
            , {'product_item_ids', list(binary(), 1, 500) }
            , {'report_format', openapi_data_output_format:openapi_data_output_format() }
            , {'reporting_timezone', openapi_reporting_time_zone:openapi_reporting_time_zone() }
            , {'start_date', binary() }
            , {'start_hour', integer(0, 23) }
            , {'targeting_types', list(openapi_ad_ads_analytics_async_targeting_types:openapi_ad_ads_analytics_async_targeting_types(), 1, 5) }
            , {'view_window_days', openapi_conversion_attribution_window_days:openapi_conversion_attribution_window_days() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

