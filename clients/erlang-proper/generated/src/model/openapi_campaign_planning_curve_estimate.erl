-module(openapi_campaign_planning_curve_estimate).

-include("openapi.hrl").

-export([openapi_campaign_planning_curve_estimate/0]).

-export([openapi_campaign_planning_curve_estimate/1]).

-export_type([openapi_campaign_planning_curve_estimate/0]).

-type openapi_campaign_planning_curve_estimate() ::
  [ {'estimation_type', openapi_campaign_planning_estimation_type:openapi_campaign_planning_estimation_type() }
  | {'points', list(openapi_campaign_planning_point_estimate:openapi_campaign_planning_point_estimate()) }
  ].


openapi_campaign_planning_curve_estimate() ->
    openapi_campaign_planning_curve_estimate([]).

openapi_campaign_planning_curve_estimate(Fields) ->
  Default = [ {'estimation_type', openapi_campaign_planning_estimation_type:openapi_campaign_planning_estimation_type() }
            , {'points', list(openapi_campaign_planning_point_estimate:openapi_campaign_planning_point_estimate()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

