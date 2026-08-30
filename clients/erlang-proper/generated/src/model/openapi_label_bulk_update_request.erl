-module(openapi_label_bulk_update_request).

-include("openapi.hrl").

-export([openapi_label_bulk_update_request/0]).

-export([openapi_label_bulk_update_request/1]).

-export_type([openapi_label_bulk_update_request/0]).

-type openapi_label_bulk_update_request() ::
  [ {'id', binary() }
  | {'parent_id', binary() }
  | {'status', openapi_label_status_bulk_update:openapi_label_status_bulk_update() }
  ].


openapi_label_bulk_update_request() ->
    openapi_label_bulk_update_request([]).

openapi_label_bulk_update_request(Fields) ->
  Default = [ {'id', binary() }
            , {'parent_id', binary() }
            , {'status', openapi_label_status_bulk_update:openapi_label_status_bulk_update() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

