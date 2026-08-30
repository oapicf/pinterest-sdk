-module(openapi_conversion_product_report_create).

-include("openapi.hrl").

-export([openapi_conversion_product_report_create/0]).

-export([openapi_conversion_product_report_create/1]).

-export_type([openapi_conversion_product_report_create/0]).

-type openapi_conversion_product_report_create() ::
  [ {'ad_group_ids', list(binary()) }
  | {'campaign_ids', list(binary()) }
  | {'campaign_objective_types', list(openapi_conversion_objective_type:openapi_conversion_objective_type()) }
  | {'click_window_days', openapi_conversion_attribution_window_days:openapi_conversion_attribution_window_days() }
  | {'columns', list(openapi_conversion_product_reporting_column:openapi_conversion_product_reporting_column()) }
  | {'conversion_product_attribution_type', openapi_conversion_product_attribution_type:openapi_conversion_product_attribution_type() }
  | {'conversion_product_breakdown', openapi_conversion_product_report_breakdown_type:openapi_conversion_product_report_breakdown_type() }
  | {'conversion_report_time', openapi_conversion_report_time_type:openapi_conversion_report_time_type() }
  | {'end_date', binary() }
  | {'granularity', openapi_conversion_product_report_granularity:openapi_conversion_product_report_granularity() }
  | {'level', openapi_conversion_product_report_level:openapi_conversion_product_report_level() }
  | {'product_sku_ids', list(binary()) }
  | {'report_name', binary() }
  | {'start_date', binary() }
  | {'view_window_days', openapi_conversion_attribution_window_days:openapi_conversion_attribution_window_days() }
  ].


openapi_conversion_product_report_create() ->
    openapi_conversion_product_report_create([]).

openapi_conversion_product_report_create(Fields) ->
  Default = [ {'ad_group_ids', list(binary(), 1, 500) }
            , {'campaign_ids', list(binary(), 1, 500) }
            , {'campaign_objective_types', list(openapi_conversion_objective_type:openapi_conversion_objective_type(), 1, 7) }
            , {'click_window_days', openapi_conversion_attribution_window_days:openapi_conversion_attribution_window_days() }
            , {'columns', list(openapi_conversion_product_reporting_column:openapi_conversion_product_reporting_column()) }
            , {'conversion_product_attribution_type', openapi_conversion_product_attribution_type:openapi_conversion_product_attribution_type() }
            , {'conversion_product_breakdown', openapi_conversion_product_report_breakdown_type:openapi_conversion_product_report_breakdown_type() }
            , {'conversion_report_time', openapi_conversion_report_time_type:openapi_conversion_report_time_type() }
            , {'end_date', binary() }
            , {'granularity', openapi_conversion_product_report_granularity:openapi_conversion_product_report_granularity() }
            , {'level', openapi_conversion_product_report_level:openapi_conversion_product_report_level() }
            , {'product_sku_ids', list(binary(), 2, 30000) }
            , {'report_name', binary() }
            , {'start_date', binary() }
            , {'view_window_days', openapi_conversion_attribution_window_days:openapi_conversion_attribution_window_days() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

