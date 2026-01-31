-module(openapi_conversion_product_report_request).

-include("openapi.hrl").

-export([openapi_conversion_product_report_request/0]).

-export([openapi_conversion_product_report_request/1]).

-export_type([openapi_conversion_product_report_request/0]).

-type openapi_conversion_product_report_request() ::
  [ {'ad_group_ids', list(binary()) }
  | {'campaign_ids', list(binary()) }
  | {'campaign_objective_types', list(openapi_objective_type:openapi_objective_type()) }
  | {'click_window_days', openapi_conversion_attribution_window_days:openapi_conversion_attribution_window_days() }
  | {'columns', list(openapi_conversion_product_reporting_column:openapi_conversion_product_reporting_column()) }
  | {'conversion_product_attribution_type', binary() }
  | {'conversion_product_breakdown', binary() }
  | {'conversion_report_time', openapi_conversion_report_time_type:openapi_conversion_report_time_type() }
  | {'end_date', binary() }
  | {'granularity', binary() }
  | {'level', binary() }
  | {'product_sku_ids', list(binary()) }
  | {'report_name', binary() }
  | {'start_date', binary() }
  | {'view_window_days', openapi_conversion_attribution_window_days:openapi_conversion_attribution_window_days() }
  ].


openapi_conversion_product_report_request() ->
    openapi_conversion_product_report_request([]).

openapi_conversion_product_report_request(Fields) ->
  Default = [ {'ad_group_ids', list(binary(), 1, 500) }
            , {'campaign_ids', list(binary(), 1, 500) }
            , {'campaign_objective_types', list(openapi_objective_type:openapi_objective_type(), 1, 7) }
            , {'click_window_days', openapi_conversion_attribution_window_days:openapi_conversion_attribution_window_days() }
            , {'columns', list(openapi_conversion_product_reporting_column:openapi_conversion_product_reporting_column()) }
            , {'conversion_product_attribution_type', elements([<<"DEFAULT">>, <<"BRAND_ATTRIBUTION">>]) }
            , {'conversion_product_breakdown', elements([<<"PRODUCT_BRAND">>, <<"PRODUCT_CATEGORY">>, <<"PRODUCT_BRAND_AND_CATEGORY">>, <<"PRODUCT_SKU">>, <<"PRODUCT_SKU_GROUP">>]) }
            , {'conversion_report_time', openapi_conversion_report_time_type:openapi_conversion_report_time_type() }
            , {'end_date', binary() }
            , {'granularity', elements([<<"WEEK">>, <<"MONTH">>, <<"TOTAL">>]) }
            , {'level', elements([<<"ADVERTISER">>, <<"CAMPAIGN">>, <<"AD_GROUP">>]) }
            , {'product_sku_ids', list(binary(), 2, 500) }
            , {'report_name', binary() }
            , {'start_date', binary() }
            , {'view_window_days', openapi_conversion_attribution_window_days:openapi_conversion_attribution_window_days() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

