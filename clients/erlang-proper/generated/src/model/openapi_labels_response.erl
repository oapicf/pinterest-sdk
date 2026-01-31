-module(openapi_labels_response).

-include("openapi.hrl").

-export([openapi_labels_response/0]).

-export([openapi_labels_response/1]).

-export_type([openapi_labels_response/0]).

-type openapi_labels_response() ::
  [ {'errors', list(openapi_label_error:openapi_label_error()) }
  | {'labels', list(openapi_label:openapi_label()) }
  ].


openapi_labels_response() ->
    openapi_labels_response([]).

openapi_labels_response(Fields) ->
  Default = [ {'errors', list(openapi_label_error:openapi_label_error()) }
            , {'labels', list(openapi_label:openapi_label()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

