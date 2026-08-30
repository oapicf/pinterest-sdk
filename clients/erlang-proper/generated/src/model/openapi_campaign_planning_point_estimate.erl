-module(openapi_campaign_planning_point_estimate).

-include("openapi.hrl").

-export([openapi_campaign_planning_point_estimate/0]).

-export([openapi_campaign_planning_point_estimate/1]).

-export_type([openapi_campaign_planning_point_estimate/0]).

-type openapi_campaign_planning_point_estimate() ::
  [ {'budget', integer() }
  | {'double_y', float() }
  | {'max_y', integer() }
  | {'min_y', integer() }
  | {'y', integer() }
  ].


openapi_campaign_planning_point_estimate() ->
    openapi_campaign_planning_point_estimate([]).

openapi_campaign_planning_point_estimate(Fields) ->
  Default = [ {'budget', integer() }
            , {'double_y', float() }
            , {'max_y', integer() }
            , {'min_y', integer() }
            , {'y', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

