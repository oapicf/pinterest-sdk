-module(openapi_campaign_id_filter).

-include("openapi.hrl").

-export([openapi_campaign_id_filter/0]).

-export([openapi_campaign_id_filter/1]).

-export_type([openapi_campaign_id_filter/0]).

-type openapi_campaign_id_filter() ::
  [ {'campaign_ids', list(binary()) }
  ].


openapi_campaign_id_filter() ->
    openapi_campaign_id_filter([]).

openapi_campaign_id_filter(Fields) ->
  Default = [ {'campaign_ids', list(binary(), 1, 500) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

