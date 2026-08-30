-module(openapi_ssio_insertion_order).

-include("openapi.hrl").

-export([openapi_ssio_insertion_order/0]).

-export([openapi_ssio_insertion_order/1]).

-export_type([openapi_ssio_insertion_order/0]).

-type openapi_ssio_insertion_order() ::
  [ {'pin_order_id', binary() }
  ].


openapi_ssio_insertion_order() ->
    openapi_ssio_insertion_order([]).

openapi_ssio_insertion_order(Fields) ->
  Default = [ {'pin_order_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

