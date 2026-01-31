-module(openapi_label_create_request_labels_inner).

-include("openapi.hrl").

-export([openapi_label_create_request_labels_inner/0]).

-export([openapi_label_create_request_labels_inner/1]).

-export_type([openapi_label_create_request_labels_inner/0]).

-type openapi_label_create_request_labels_inner() ::
  [ {'label_type', openapi_label_type:openapi_label_type() }
  | {'value', binary() }
  ].


openapi_label_create_request_labels_inner() ->
    openapi_label_create_request_labels_inner([]).

openapi_label_create_request_labels_inner(Fields) ->
  Default = [ {'label_type', openapi_label_type:openapi_label_type() }
            , {'value', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

