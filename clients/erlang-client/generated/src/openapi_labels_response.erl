-module(openapi_labels_response).

-export([encode/1]).

-export_type([openapi_labels_response/0]).

-type openapi_labels_response() ::
    #{ 'errors' => list(),
       'labels' => list()
     }.

encode(#{ 'errors' := Errors,
          'labels' := Labels
        }) ->
    #{ 'errors' => Errors,
       'labels' => Labels
     }.
