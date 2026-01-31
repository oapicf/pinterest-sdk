-module(openapi_label_bulk_update_request).

-include("openapi.hrl").

-export([openapi_label_bulk_update_request/0]).

-export([openapi_label_bulk_update_request/1]).

-export_type([openapi_label_bulk_update_request/0]).

-type openapi_label_bulk_update_request() ::
  [ {'id', binary() }
  | {'status', binary() }
  | {'value', binary() }
  ].


openapi_label_bulk_update_request() ->
    openapi_label_bulk_update_request([]).

openapi_label_bulk_update_request(Fields) ->
  Default = [ {'id', binary() }
            , {'status', elements([<<"ARCHIVED">>]) }
            , {'value', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

