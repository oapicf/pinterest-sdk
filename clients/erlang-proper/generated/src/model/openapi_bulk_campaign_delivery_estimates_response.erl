-module(openapi_bulk_campaign_delivery_estimates_response).

-include("openapi.hrl").

-export([openapi_bulk_campaign_delivery_estimates_response/0]).

-export([openapi_bulk_campaign_delivery_estimates_response/1]).

-export_type([openapi_bulk_campaign_delivery_estimates_response/0]).

-type openapi_bulk_campaign_delivery_estimates_response() ::
  [ {'data', list(openapi_bulk_campaign_delivery_estimates_item:openapi_bulk_campaign_delivery_estimates_item()) }
  ].


openapi_bulk_campaign_delivery_estimates_response() ->
    openapi_bulk_campaign_delivery_estimates_response([]).

openapi_bulk_campaign_delivery_estimates_response(Fields) ->
  Default = [ {'data', list(openapi_bulk_campaign_delivery_estimates_item:openapi_bulk_campaign_delivery_estimates_item()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

