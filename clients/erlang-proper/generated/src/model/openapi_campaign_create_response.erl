-module(openapi_campaign_create_response).

-include("openapi.hrl").

-export([openapi_campaign_create_response/0]).

-export([openapi_campaign_create_response/1]).

-export_type([openapi_campaign_create_response/0]).

-type openapi_campaign_create_response() ::
  [ {'items', list(openapi_campaign_create_response_item:openapi_campaign_create_response_item()) }
  ].


openapi_campaign_create_response() ->
    openapi_campaign_create_response([]).

openapi_campaign_create_response(Fields) ->
  Default = [ {'items', list(openapi_campaign_create_response_item:openapi_campaign_create_response_item()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

