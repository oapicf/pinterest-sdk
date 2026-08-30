-module(openapi_label_bulk_create_request).

-include("openapi.hrl").

-export([openapi_label_bulk_create_request/0]).

-export([openapi_label_bulk_create_request/1]).

-export_type([openapi_label_bulk_create_request/0]).

-type openapi_label_bulk_create_request() ::
  [ {'labels', list(openapi_label_create_item:openapi_label_create_item()) }
  | {'parent_id', binary() }
  ].


openapi_label_bulk_create_request() ->
    openapi_label_bulk_create_request([]).

openapi_label_bulk_create_request(Fields) ->
  Default = [ {'labels', list(openapi_label_create_item:openapi_label_create_item()) }
            , {'parent_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

