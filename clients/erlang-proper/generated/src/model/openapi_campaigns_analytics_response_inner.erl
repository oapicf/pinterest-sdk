-module(openapi_campaigns_analytics_response_inner).

-include("openapi.hrl").

-export([openapi_campaigns_analytics_response_inner/0]).

-export([openapi_campaigns_analytics_response_inner/1]).

-export_type([openapi_campaigns_analytics_response_inner/0]).

-type openapi_campaigns_analytics_response_inner() ::
  [ {'CAMPAIGN_ID', binary() }
  | {'DATE', date() }
  ].


openapi_campaigns_analytics_response_inner() ->
    openapi_campaigns_analytics_response_inner([]).

openapi_campaigns_analytics_response_inner(Fields) ->
  Default = [ {'CAMPAIGN_ID', binary() }
            , {'DATE', date() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

