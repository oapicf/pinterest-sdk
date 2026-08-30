-module(openapi_campaigns_analytics_metrics).

-include("openapi.hrl").

-export([openapi_campaigns_analytics_metrics/0]).

-export([openapi_campaigns_analytics_metrics/1]).

-export_type([openapi_campaigns_analytics_metrics/0]).

-type openapi_campaigns_analytics_metrics() ::
  [ {'CAMPAIGN_ID', binary() }
  | {'DATE', date() }
  ].


openapi_campaigns_analytics_metrics() ->
    openapi_campaigns_analytics_metrics([]).

openapi_campaigns_analytics_metrics(Fields) ->
  Default = [ {'CAMPAIGN_ID', binary() }
            , {'DATE', date() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

