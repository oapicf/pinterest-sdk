-module(openapi_performance_plus_campaign_settings).

-include("openapi.hrl").

-export([openapi_performance_plus_campaign_settings/0]).

-export([openapi_performance_plus_campaign_settings/1]).

-export_type([openapi_performance_plus_campaign_settings/0]).

-type openapi_performance_plus_campaign_settings() ::
  [ {'boost_prospecting_ad_group_bid', boolean() }
  | {'pinner_list_exclusions', list(binary()) }
  ].


openapi_performance_plus_campaign_settings() ->
    openapi_performance_plus_campaign_settings([]).

openapi_performance_plus_campaign_settings(Fields) ->
  Default = [ {'boost_prospecting_ad_group_bid', boolean() }
            , {'pinner_list_exclusions', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

