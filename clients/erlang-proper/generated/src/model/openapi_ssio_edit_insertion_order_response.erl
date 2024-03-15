-module(openapi_ssio_edit_insertion_order_response).

-include("openapi.hrl").

-export([openapi_ssio_edit_insertion_order_response/0]).

-export([openapi_ssio_edit_insertion_order_response/1]).

-export_type([openapi_ssio_edit_insertion_order_response/0]).

-type openapi_ssio_edit_insertion_order_response() ::
  [ {'pin_order_id', binary() }
  ].


openapi_ssio_edit_insertion_order_response() ->
    openapi_ssio_edit_insertion_order_response([]).

openapi_ssio_edit_insertion_order_response(Fields) ->
  Default = [ {'pin_order_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

