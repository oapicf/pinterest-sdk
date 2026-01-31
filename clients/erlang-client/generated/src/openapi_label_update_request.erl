-module(openapi_label_update_request).

-export([encode/1]).

-export_type([openapi_label_update_request/0]).

-type openapi_label_update_request() ::
    #{ 'labels' := list()
     }.

encode(#{ 'labels' := Labels
        }) ->
    #{ 'labels' => Labels
     }.
