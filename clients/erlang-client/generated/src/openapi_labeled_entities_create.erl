-module(openapi_labeled_entities_create).

-export([encode/1]).

-export_type([openapi_labeled_entities_create/0]).

-type openapi_labeled_entities_create() ::
    #{ 'entity_ids' := list()
     }.

encode(#{ 'entity_ids' := EntityIds
        }) ->
    #{ 'entity_ids' => EntityIds
     }.
