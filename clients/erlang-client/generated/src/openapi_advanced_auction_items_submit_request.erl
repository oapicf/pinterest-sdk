-module(openapi_advanced_auction_items_submit_request).

-export([encode/1]).

-export_type([openapi_advanced_auction_items_submit_request/0]).

-type openapi_advanced_auction_items_submit_request() ::
    #{ 'catalog_id' := binary(),
       'items' := list()
     }.

encode(#{ 'catalog_id' := CatalogId,
          'items' := Items
        }) ->
    #{ 'catalog_id' => CatalogId,
       'items' => Items
     }.
