-module(openapi_label_update_request_labels_inner).

-include("openapi.hrl").

-export([openapi_label_update_request_labels_inner/0]).

-export([openapi_label_update_request_labels_inner/1]).

-export_type([openapi_label_update_request_labels_inner/0]).

-type openapi_label_update_request_labels_inner() ::
  [ {'id', binary() }
  | {'status', openapi_label_status:openapi_label_status() }
  | {'value', binary() }
  ].


openapi_label_update_request_labels_inner() ->
    openapi_label_update_request_labels_inner([]).

openapi_label_update_request_labels_inner(Fields) ->
  Default = [ {'id', binary() }
            , {'status', openapi_label_status:openapi_label_status() }
            , {'value', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

