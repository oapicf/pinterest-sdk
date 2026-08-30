-module(openapi_label_bulk_create_request).

-export([encode/1]).

-export_type([openapi_label_bulk_create_request/0]).

-type openapi_label_bulk_create_request() ::
    #{ 'labels' := list(),
       'parent_id' := binary()
     }.

encode(#{ 'labels' := Labels,
          'parent_id' := ParentId
        }) ->
    #{ 'labels' => Labels,
       'parent_id' => ParentId
     }.
