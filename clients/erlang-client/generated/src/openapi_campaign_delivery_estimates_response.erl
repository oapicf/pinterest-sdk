-module(openapi_campaign_delivery_estimates_response).

-export([encode/1]).

-export_type([openapi_campaign_delivery_estimates_response/0]).

-type openapi_campaign_delivery_estimates_response() ::
    #{ 'curves' => list(),
       'derived_metrics' => openapi_campaign_delivery_estimates_derived_metrics:openapi_campaign_delivery_estimates_derived_metrics(),
       'max_potential_spend' => integer()
     }.

encode(#{ 'curves' := Curves,
          'derived_metrics' := DerivedMetrics,
          'max_potential_spend' := MaxPotentialSpend
        }) ->
    #{ 'curves' => Curves,
       'derived_metrics' => DerivedMetrics,
       'max_potential_spend' => MaxPotentialSpend
     }.
