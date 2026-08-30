-module(openapi_bulk_campaign_delivery_estimates_item).

-include("openapi.hrl").

-export([openapi_bulk_campaign_delivery_estimates_item/0]).

-export([openapi_bulk_campaign_delivery_estimates_item/1]).

-export_type([openapi_bulk_campaign_delivery_estimates_item/0]).

-type openapi_bulk_campaign_delivery_estimates_item() ::
  [ {'adgroup_audience_sizes', list(openapi_campaign_planning_ad_group_audience_size:openapi_campaign_planning_ad_group_audience_size()) }
  | {'conversion_rate', integer() }
  | {'conversion_rates', list(openapi_campaign_planning_conversion_rate:openapi_campaign_planning_conversion_rate()) }
  | {'curves', list(openapi_campaign_planning_curve_estimate:openapi_campaign_planning_curve_estimate()) }
  | {'derived_metrics', openapi_campaign_delivery_estimates_derived_metrics:openapi_campaign_delivery_estimates_derived_metrics() }
  | {'errors', list(openapi_campaign_planning_response_error:openapi_campaign_planning_response_error()) }
  | {'estimate_id', binary() }
  | {'max_potential_spend', integer() }
  ].


openapi_bulk_campaign_delivery_estimates_item() ->
    openapi_bulk_campaign_delivery_estimates_item([]).

openapi_bulk_campaign_delivery_estimates_item(Fields) ->
  Default = [ {'adgroup_audience_sizes', list(openapi_campaign_planning_ad_group_audience_size:openapi_campaign_planning_ad_group_audience_size()) }
            , {'conversion_rate', integer() }
            , {'conversion_rates', list(openapi_campaign_planning_conversion_rate:openapi_campaign_planning_conversion_rate()) }
            , {'curves', list(openapi_campaign_planning_curve_estimate:openapi_campaign_planning_curve_estimate()) }
            , {'derived_metrics', openapi_campaign_delivery_estimates_derived_metrics:openapi_campaign_delivery_estimates_derived_metrics() }
            , {'errors', list(openapi_campaign_planning_response_error:openapi_campaign_planning_response_error()) }
            , {'estimate_id', binary() }
            , {'max_potential_spend', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

