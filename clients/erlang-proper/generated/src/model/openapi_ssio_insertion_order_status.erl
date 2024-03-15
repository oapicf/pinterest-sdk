-module(openapi_ssio_insertion_order_status).

-include("openapi.hrl").

-export([openapi_ssio_insertion_order_status/0]).

-export([openapi_ssio_insertion_order_status/1]).

-export_type([openapi_ssio_insertion_order_status/0]).

-type openapi_ssio_insertion_order_status() ::
  [ {'pin_order_id', binary() }
  | {'status', binary() }
  | {'creation_time', binary() }
  ].


openapi_ssio_insertion_order_status() ->
    openapi_ssio_insertion_order_status([]).

openapi_ssio_insertion_order_status(Fields) ->
  Default = [ {'pin_order_id', binary() }
            , {'status', binary() }
            , {'creation_time', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

