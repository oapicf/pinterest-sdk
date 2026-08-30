-module(openapi_labeled_entities).

-export([encode/1]).

-export_type([openapi_labeled_entities/0]).

-type openapi_labeled_entities() ::
    #{ 'entities_labels' => list(),
       'errors' => list()
     }.

encode(#{ 'entities_labels' := EntitiesLabels,
          'errors' := Errors
        }) ->
    #{ 'entities_labels' => EntitiesLabels,
       'errors' => Errors
     }.
