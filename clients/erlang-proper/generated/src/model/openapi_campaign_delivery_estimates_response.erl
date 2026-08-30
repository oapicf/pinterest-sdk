-module(openapi_campaign_delivery_estimates_response).

-include("openapi.hrl").

-export([openapi_campaign_delivery_estimates_response/0]).

-export([openapi_campaign_delivery_estimates_response/1]).

-export_type([openapi_campaign_delivery_estimates_response/0]).

-type openapi_campaign_delivery_estimates_response() ::
  [ {'curves', list(openapi_campaign_planning_curve_estimate:openapi_campaign_planning_curve_estimate()) }
  | {'derived_metrics', openapi_campaign_delivery_estimates_derived_metrics:openapi_campaign_delivery_estimates_derived_metrics() }
  | {'max_potential_spend', integer() }
  ].


openapi_campaign_delivery_estimates_response() ->
    openapi_campaign_delivery_estimates_response([]).

openapi_campaign_delivery_estimates_response(Fields) ->
  Default = [ {'curves', list(openapi_campaign_planning_curve_estimate:openapi_campaign_planning_curve_estimate()) }
            , {'derived_metrics', openapi_campaign_delivery_estimates_derived_metrics:openapi_campaign_delivery_estimates_derived_metrics() }
            , {'max_potential_spend', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

