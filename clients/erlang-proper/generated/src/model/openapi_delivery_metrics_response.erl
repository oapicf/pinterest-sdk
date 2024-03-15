-module(openapi_delivery_metrics_response).

-include("openapi.hrl").

-export([openapi_delivery_metrics_response/0]).

-export([openapi_delivery_metrics_response/1]).

-export_type([openapi_delivery_metrics_response/0]).

-type openapi_delivery_metrics_response() ::
  [ {'items', list(openapi_delivery_metrics_response_items_inner:openapi_delivery_metrics_response_items_inner()) }
  ].


openapi_delivery_metrics_response() ->
    openapi_delivery_metrics_response([]).

openapi_delivery_metrics_response(Fields) ->
  Default = [ {'items', list(openapi_delivery_metrics_response_items_inner:openapi_delivery_metrics_response_items_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

