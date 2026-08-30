-module(openapi_delivery_metrics_response_items_items).

-include("openapi.hrl").

-export([openapi_delivery_metrics_response_items_items/0]).

-export([openapi_delivery_metrics_response_items_items/1]).

-export_type([openapi_delivery_metrics_response_items_items/0]).

-type openapi_delivery_metrics_response_items_items() ::
  [ {'category', binary() }
  | {'definition', binary() }
  | {'display_name', binary() }
  | {'name', binary() }
  ].


openapi_delivery_metrics_response_items_items() ->
    openapi_delivery_metrics_response_items_items([]).

openapi_delivery_metrics_response_items_items(Fields) ->
  Default = [ {'category', elements([<<"ADS">>, <<"ORGANIC">>]) }
            , {'definition', binary() }
            , {'display_name', binary() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

