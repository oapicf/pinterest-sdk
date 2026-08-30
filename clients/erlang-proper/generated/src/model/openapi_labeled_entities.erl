-module(openapi_labeled_entities).

-include("openapi.hrl").

-export([openapi_labeled_entities/0]).

-export([openapi_labeled_entities/1]).

-export_type([openapi_labeled_entities/0]).

-type openapi_labeled_entities() ::
  [ {'entities_labels', list(openapi_entity_label:openapi_entity_label()) }
  | {'errors', list(openapi_entity_label_error:openapi_entity_label_error()) }
  ].


openapi_labeled_entities() ->
    openapi_labeled_entities([]).

openapi_labeled_entities(Fields) ->
  Default = [ {'entities_labels', list(openapi_entity_label:openapi_entity_label()) }
            , {'errors', list(openapi_entity_label_error:openapi_entity_label_error()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

