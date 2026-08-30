-module(openapi_entity_label).

-include("openapi.hrl").

-export([openapi_entity_label/0]).

-export([openapi_entity_label/1]).

-export_type([openapi_entity_label/0]).

-type openapi_entity_label() ::
  [ {'entity_id', binary() }
  | {'entity_type', openapi_label_parent_type:openapi_label_parent_type() }
  | {'label_id', binary() }
  | {'status', openapi_entity_label_status:openapi_entity_label_status() }
  ].


openapi_entity_label() ->
    openapi_entity_label([]).

openapi_entity_label(Fields) ->
  Default = [ {'entity_id', binary() }
            , {'entity_type', openapi_label_parent_type:openapi_label_parent_type() }
            , {'label_id', binary() }
            , {'status', openapi_entity_label_status:openapi_entity_label_status() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

