-module(openapi_campaign_create_response_item).

-include("openapi.hrl").

-export([openapi_campaign_create_response_item/0]).

-export([openapi_campaign_create_response_item/1]).

-export_type([openapi_campaign_create_response_item/0]).

-type openapi_campaign_create_response_item() ::
  [ {'data', openapi_campaign_create_response_data:openapi_campaign_create_response_data() }
  | {'exceptions', list(openapi_exception:openapi_exception()) }
  ].


openapi_campaign_create_response_item() ->
    openapi_campaign_create_response_item([]).

openapi_campaign_create_response_item(Fields) ->
  Default = [ {'data', openapi_campaign_create_response_data:openapi_campaign_create_response_data() }
            , {'exceptions', list(openapi_exception:openapi_exception()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

