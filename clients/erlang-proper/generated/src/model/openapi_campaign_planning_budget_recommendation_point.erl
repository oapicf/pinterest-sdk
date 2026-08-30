-module(openapi_campaign_planning_budget_recommendation_point).

-include("openapi.hrl").

-export([openapi_campaign_planning_budget_recommendation_point/0]).

-export([openapi_campaign_planning_budget_recommendation_point/1]).

-export_type([openapi_campaign_planning_budget_recommendation_point/0]).

-type openapi_campaign_planning_budget_recommendation_point() ::
  [ {'estimation_type', openapi_campaign_planning_estimation_type:openapi_campaign_planning_estimation_type() }
  | {'point_estimate', openapi_campaign_planning_point_estimate:openapi_campaign_planning_point_estimate() }
  ].


openapi_campaign_planning_budget_recommendation_point() ->
    openapi_campaign_planning_budget_recommendation_point([]).

openapi_campaign_planning_budget_recommendation_point(Fields) ->
  Default = [ {'estimation_type', openapi_campaign_planning_estimation_type:openapi_campaign_planning_estimation_type() }
            , {'point_estimate', openapi_campaign_planning_point_estimate:openapi_campaign_planning_point_estimate() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

