-module(openapi_campaign_planning_ad_group_audience_size).

-include("openapi.hrl").

-export([openapi_campaign_planning_ad_group_audience_size/0]).

-export([openapi_campaign_planning_ad_group_audience_size/1]).

-export_type([openapi_campaign_planning_ad_group_audience_size/0]).

-type openapi_campaign_planning_ad_group_audience_size() ::
  [ {'count_lower', integer() }
  | {'count_upper', integer() }
  ].


openapi_campaign_planning_ad_group_audience_size() ->
    openapi_campaign_planning_ad_group_audience_size([]).

openapi_campaign_planning_ad_group_audience_size(Fields) ->
  Default = [ {'count_lower', integer(0) }
            , {'count_upper', integer(0) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

