-module(openapi_label_error).

-include("openapi.hrl").

-export([openapi_label_error/0]).

-export([openapi_label_error/1]).

-export_type([openapi_label_error/0]).

-type openapi_label_error() ::
  [ {'data', openapi_label_error_data:openapi_label_error_data() }
  | {'error_messages', list(binary()) }
  ].


openapi_label_error() ->
    openapi_label_error([]).

openapi_label_error(Fields) ->
  Default = [ {'data', openapi_label_error_data:openapi_label_error_data() }
            , {'error_messages', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

