-module(openapi_campaign_delivery_estimates_campaign).

-include("openapi.hrl").

-export([openapi_campaign_delivery_estimates_campaign/0]).

-export([openapi_campaign_delivery_estimates_campaign/1]).

-export_type([openapi_campaign_delivery_estimates_campaign/0]).

-type openapi_campaign_delivery_estimates_campaign() ::
  [ {'ad_groups', list(openapi_ad_group_delivery_estimates:openapi_ad_group_delivery_estimates()) }
  | {'budget_duration_type', openapi_budget_duration_type:openapi_budget_duration_type() }
  | {'daily_spend_cap', integer() }
  | {'end_date', binary() }
  | {'lifetime_spend_cap', integer() }
  | {'objective_type', openapi_delivery_estimate_objective_type:openapi_delivery_estimate_objective_type() }
  | {'start_date', binary() }
  ].


openapi_campaign_delivery_estimates_campaign() ->
    openapi_campaign_delivery_estimates_campaign([]).

openapi_campaign_delivery_estimates_campaign(Fields) ->
  Default = [ {'ad_groups', list(openapi_ad_group_delivery_estimates:openapi_ad_group_delivery_estimates(), 1, 10) }
            , {'budget_duration_type', openapi_budget_duration_type:openapi_budget_duration_type() }
            , {'daily_spend_cap', integer() }
            , {'end_date', binary() }
            , {'lifetime_spend_cap', integer() }
            , {'objective_type', openapi_delivery_estimate_objective_type:openapi_delivery_estimate_objective_type() }
            , {'start_date', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

