-module(openapi_campaign_planning_conversion_attribution).

-include("openapi.hrl").

-export([openapi_campaign_planning_conversion_attribution/0]).

-export([openapi_campaign_planning_conversion_attribution/1]).

-export_type([openapi_campaign_planning_conversion_attribution/0]).

-type openapi_campaign_planning_conversion_attribution() ::
  [ {'click_window_days', openapi_campaign_planning_conversion_attribution_window_days:openapi_campaign_planning_conversion_attribution_window_days() }
  | {'engagement_window_days', openapi_campaign_planning_conversion_attribution_window_days:openapi_campaign_planning_conversion_attribution_window_days() }
  | {'view_window_days', openapi_campaign_planning_conversion_attribution_window_days:openapi_campaign_planning_conversion_attribution_window_days() }
  ].


openapi_campaign_planning_conversion_attribution() ->
    openapi_campaign_planning_conversion_attribution([]).

openapi_campaign_planning_conversion_attribution(Fields) ->
  Default = [ {'click_window_days', openapi_campaign_planning_conversion_attribution_window_days:openapi_campaign_planning_conversion_attribution_window_days() }
            , {'engagement_window_days', openapi_campaign_planning_conversion_attribution_window_days:openapi_campaign_planning_conversion_attribution_window_days() }
            , {'view_window_days', openapi_campaign_planning_conversion_attribution_window_days:openapi_campaign_planning_conversion_attribution_window_days() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

