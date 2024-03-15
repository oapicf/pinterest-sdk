-module(openapi_campaign_id).

-include("openapi.hrl").

-export([openapi_campaign_id/0]).

-export([openapi_campaign_id/1]).

-export_type([openapi_campaign_id/0]).

-type openapi_campaign_id() ::
  [ {'id', binary() }
  ].


openapi_campaign_id() ->
    openapi_campaign_id([]).

openapi_campaign_id(Fields) ->
  Default = [ {'id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

