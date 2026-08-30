-module(openapi_bulk_campaign_delivery_estimates_item).

-export([encode/1]).

-export_type([openapi_bulk_campaign_delivery_estimates_item/0]).

-type openapi_bulk_campaign_delivery_estimates_item() ::
    #{ 'adgroup_audience_sizes' => list(),
       'conversion_rate' => integer(),
       'conversion_rates' => list(),
       'curves' => list(),
       'derived_metrics' => openapi_campaign_delivery_estimates_derived_metrics:openapi_campaign_delivery_estimates_derived_metrics(),
       'errors' => list(),
       'estimate_id' => binary(),
       'max_potential_spend' => integer()
     }.

encode(#{ 'adgroup_audience_sizes' := AdgroupAudienceSizes,
          'conversion_rate' := ConversionRate,
          'conversion_rates' := ConversionRates,
          'curves' := Curves,
          'derived_metrics' := DerivedMetrics,
          'errors' := Errors,
          'estimate_id' := EstimateId,
          'max_potential_spend' := MaxPotentialSpend
        }) ->
    #{ 'adgroup_audience_sizes' => AdgroupAudienceSizes,
       'conversion_rate' => ConversionRate,
       'conversion_rates' => ConversionRates,
       'curves' => Curves,
       'derived_metrics' => DerivedMetrics,
       'errors' => Errors,
       'estimate_id' => EstimateId,
       'max_potential_spend' => MaxPotentialSpend
     }.
