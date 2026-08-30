-module(openapi_conversion_product_report_create).

-export([encode/1]).

-export_type([openapi_conversion_product_report_create/0]).

-type openapi_conversion_product_report_create() ::
    #{ 'ad_group_ids' => list(),
       'campaign_ids' => list(),
       'campaign_objective_types' => list(),
       'click_window_days' => openapi_conversion_attribution_window_days:openapi_conversion_attribution_window_days(),
       'columns' := list(),
       'conversion_product_attribution_type' => openapi_conversion_product_attribution_type:openapi_conversion_product_attribution_type(),
       'conversion_product_breakdown' => openapi_conversion_product_report_breakdown_type:openapi_conversion_product_report_breakdown_type(),
       'conversion_report_time' => openapi_conversion_report_time_type:openapi_conversion_report_time_type(),
       'end_date' := binary(),
       'granularity' := openapi_conversion_product_report_granularity:openapi_conversion_product_report_granularity(),
       'level' := openapi_conversion_product_report_level:openapi_conversion_product_report_level(),
       'product_sku_ids' => list(),
       'report_name' := binary(),
       'start_date' := binary(),
       'view_window_days' => openapi_conversion_attribution_window_days:openapi_conversion_attribution_window_days()
     }.

encode(#{ 'ad_group_ids' := AdGroupIds,
          'campaign_ids' := CampaignIds,
          'campaign_objective_types' := CampaignObjectiveTypes,
          'click_window_days' := ClickWindowDays,
          'columns' := Columns,
          'conversion_product_attribution_type' := ConversionProductAttributionType,
          'conversion_product_breakdown' := ConversionProductBreakdown,
          'conversion_report_time' := ConversionReportTime,
          'end_date' := EndDate,
          'granularity' := Granularity,
          'level' := Level,
          'product_sku_ids' := ProductSkuIds,
          'report_name' := ReportName,
          'start_date' := StartDate,
          'view_window_days' := ViewWindowDays
        }) ->
    #{ 'ad_group_ids' => AdGroupIds,
       'campaign_ids' => CampaignIds,
       'campaign_objective_types' => CampaignObjectiveTypes,
       'click_window_days' => ClickWindowDays,
       'columns' => Columns,
       'conversion_product_attribution_type' => ConversionProductAttributionType,
       'conversion_product_breakdown' => ConversionProductBreakdown,
       'conversion_report_time' => ConversionReportTime,
       'end_date' => EndDate,
       'granularity' => Granularity,
       'level' => Level,
       'product_sku_ids' => ProductSkuIds,
       'report_name' => ReportName,
       'start_date' => StartDate,
       'view_window_days' => ViewWindowDays
     }.
