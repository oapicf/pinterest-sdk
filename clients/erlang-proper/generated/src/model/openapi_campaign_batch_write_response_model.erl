-module(openapi_campaign_batch_write_response_model).

-include("openapi.hrl").

-export([openapi_campaign_batch_write_response_model/0]).

-export([openapi_campaign_batch_write_response_model/1]).

-export_type([openapi_campaign_batch_write_response_model/0]).

-type openapi_campaign_batch_write_response_model() ::
  [ {'items', list(openapi_campaign_batch_item:openapi_campaign_batch_item()) }
  ].


openapi_campaign_batch_write_response_model() ->
    openapi_campaign_batch_write_response_model([]).

openapi_campaign_batch_write_response_model(Fields) ->
  Default = [ {'items', list(openapi_campaign_batch_item:openapi_campaign_batch_item()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

