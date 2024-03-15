-module(openapi_catalogs_items).

-export([encode/1]).

-export_type([openapi_catalogs_items/0]).

-type openapi_catalogs_items() ::
    #{ 'items' => list()
     }.

encode(#{ 'items' := Items
        }) ->
    #{ 'items' => Items
     }.
