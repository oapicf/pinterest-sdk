-module(openapi_label_update_request).

-include("openapi.hrl").

-export([openapi_label_update_request/0]).

-export([openapi_label_update_request/1]).

-export_type([openapi_label_update_request/0]).

-type openapi_label_update_request() ::
  [ {'labels', list(openapi_label_update_request_labels_inner:openapi_label_update_request_labels_inner()) }
  ].


openapi_label_update_request() ->
    openapi_label_update_request([]).

openapi_label_update_request(Fields) ->
  Default = [ {'labels', list(openapi_label_update_request_labels_inner:openapi_label_update_request_labels_inner()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

