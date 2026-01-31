-module(openapi_campaign_audience_multipliers).

-include("openapi.hrl").

-export([openapi_campaign_audience_multipliers/0]).

-export([openapi_campaign_audience_multipliers/1]).

-export_type([openapi_campaign_audience_multipliers/0]).

-type openapi_campaign_audience_multipliers() ::
  [ {'AUDIENCE_ID', binary() }
  ].


openapi_campaign_audience_multipliers() ->
    openapi_campaign_audience_multipliers([]).

openapi_campaign_audience_multipliers(Fields) ->
  Default = [ {'AUDIENCE_ID', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

