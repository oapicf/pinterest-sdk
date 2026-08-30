-module(openapi_labeled_entities_create).

-include("openapi.hrl").

-export([openapi_labeled_entities_create/0]).

-export([openapi_labeled_entities_create/1]).

-export_type([openapi_labeled_entities_create/0]).

-type openapi_labeled_entities_create() ::
  [ {'entity_ids', list(binary()) }
  ].


openapi_labeled_entities_create() ->
    openapi_labeled_entities_create([]).

openapi_labeled_entities_create(Fields) ->
  Default = [ {'entity_ids', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

