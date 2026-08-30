-module(openapi_entity_label_error).

-include("openapi.hrl").

-export([openapi_entity_label_error/0]).

-export([openapi_entity_label_error/1]).

-export_type([openapi_entity_label_error/0]).

-type openapi_entity_label_error() ::
  [ {'data', openapi_entity_label:openapi_entity_label() }
  | {'error_messages', list(binary()) }
  ].


openapi_entity_label_error() ->
    openapi_entity_label_error([]).

openapi_entity_label_error(Fields) ->
  Default = [ {'data', openapi_entity_label:openapi_entity_label() }
            , {'error_messages', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

