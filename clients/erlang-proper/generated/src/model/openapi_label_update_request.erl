-module(openapi_label_update_request).

-include("openapi.hrl").

-export([openapi_label_update_request/0]).

-export([openapi_label_update_request/1]).

-export_type([openapi_label_update_request/0]).

-type openapi_label_update_request() ::
  [ {'labels', list(openapi_label_update_item:openapi_label_update_item()) }
  ].


openapi_label_update_request() ->
    openapi_label_update_request([]).

openapi_label_update_request(Fields) ->
  Default = [ {'labels', list(openapi_label_update_item:openapi_label_update_item()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

