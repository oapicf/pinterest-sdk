-module(openapi_campaign_planning_conversion_rate).

-include("openapi.hrl").

-export([openapi_campaign_planning_conversion_rate/0]).

-export([openapi_campaign_planning_conversion_rate/1]).

-export_type([openapi_campaign_planning_conversion_rate/0]).

-type openapi_campaign_planning_conversion_rate() ::
  [ {'attribution_windows', openapi_campaign_planning_conversion_attribution:openapi_campaign_planning_conversion_attribution() }
  | {'conversion_event', openapi_campaign_planning_conversion_event:openapi_campaign_planning_conversion_event() }
  | {'conversion_rate', integer() }
  ].


openapi_campaign_planning_conversion_rate() ->
    openapi_campaign_planning_conversion_rate([]).

openapi_campaign_planning_conversion_rate(Fields) ->
  Default = [ {'attribution_windows', openapi_campaign_planning_conversion_attribution:openapi_campaign_planning_conversion_attribution() }
            , {'conversion_event', openapi_campaign_planning_conversion_event:openapi_campaign_planning_conversion_event() }
            , {'conversion_rate', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

