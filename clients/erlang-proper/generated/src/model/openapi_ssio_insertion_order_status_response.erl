-module(openapi_ssio_insertion_order_status_response).

-include("openapi.hrl").

-export([openapi_ssio_insertion_order_status_response/0]).

-export([openapi_ssio_insertion_order_status_response/1]).

-export_type([openapi_ssio_insertion_order_status_response/0]).

-type openapi_ssio_insertion_order_status_response() ::
  [ {'pin_order_id', binary() }
  | {'status', binary() }
  | {'creation_time', binary() }
  ].


openapi_ssio_insertion_order_status_response() ->
    openapi_ssio_insertion_order_status_response([]).

openapi_ssio_insertion_order_status_response(Fields) ->
  Default = [ {'pin_order_id', binary() }
            , {'status', binary() }
            , {'creation_time', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

