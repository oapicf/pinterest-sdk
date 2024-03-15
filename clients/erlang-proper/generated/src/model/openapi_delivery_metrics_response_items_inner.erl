-module(openapi_delivery_metrics_response_items_inner).

-include("openapi.hrl").

-export([openapi_delivery_metrics_response_items_inner/0]).

-export([openapi_delivery_metrics_response_items_inner/1]).

-export_type([openapi_delivery_metrics_response_items_inner/0]).

-type openapi_delivery_metrics_response_items_inner() ::
  [ {'name', binary() }
  | {'category', binary() }
  | {'definition', binary() }
  | {'display_name', binary() }
  ].


openapi_delivery_metrics_response_items_inner() ->
    openapi_delivery_metrics_response_items_inner([]).

openapi_delivery_metrics_response_items_inner(Fields) ->
  Default = [ {'name', binary() }
            , {'category', elements([<<"ADS">>, <<"ORGANIC">>]) }
            , {'definition', binary() }
            , {'display_name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

