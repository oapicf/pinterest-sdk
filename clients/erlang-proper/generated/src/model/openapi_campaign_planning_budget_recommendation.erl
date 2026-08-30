-module(openapi_campaign_planning_budget_recommendation).

-include("openapi.hrl").

-export([openapi_campaign_planning_budget_recommendation/0]).

-export([openapi_campaign_planning_budget_recommendation/1]).

-export_type([openapi_campaign_planning_budget_recommendation/0]).

-type openapi_campaign_planning_budget_recommendation() ::
  [ {'budget_recommendation', integer() }
  | {'experiment_campaign_budget_recommendation', list(openapi_campaign_planning_experiment_budget_recommendation:openapi_campaign_planning_experiment_budget_recommendation()) }
  | {'lifetime_days_recommendation', integer() }
  | {'point_estimations', list(openapi_campaign_planning_budget_recommendation_point:openapi_campaign_planning_budget_recommendation_point()) }
  ].


openapi_campaign_planning_budget_recommendation() ->
    openapi_campaign_planning_budget_recommendation([]).

openapi_campaign_planning_budget_recommendation(Fields) ->
  Default = [ {'budget_recommendation', integer() }
            , {'experiment_campaign_budget_recommendation', list(openapi_campaign_planning_experiment_budget_recommendation:openapi_campaign_planning_experiment_budget_recommendation()) }
            , {'lifetime_days_recommendation', integer() }
            , {'point_estimations', list(openapi_campaign_planning_budget_recommendation_point:openapi_campaign_planning_budget_recommendation_point()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

