-module(openapi_ad_groups_analytics_metrics).

-include("openapi.hrl").

-export([openapi_ad_groups_analytics_metrics/0]).

-export([openapi_ad_groups_analytics_metrics/1]).

-export_type([openapi_ad_groups_analytics_metrics/0]).

-type openapi_ad_groups_analytics_metrics() ::
  [ {'AD_GROUP_ID', binary() }
  | {'DATE', date() }
  ].


openapi_ad_groups_analytics_metrics() ->
    openapi_ad_groups_analytics_metrics([]).

openapi_ad_groups_analytics_metrics(Fields) ->
  Default = [ {'AD_GROUP_ID', binary() }
            , {'DATE', date() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

