-module(openapi_advanced_auction_items).

-export([encode/1]).

-export_type([openapi_advanced_auction_items/0]).

-type openapi_advanced_auction_items() ::
    #{ 'catalog_id' => binary(),
       'items' => list()
     }.

encode(#{ 'catalog_id' := CatalogId,
          'items' := Items
        }) ->
    #{ 'catalog_id' => CatalogId,
       'items' => Items
     }.
