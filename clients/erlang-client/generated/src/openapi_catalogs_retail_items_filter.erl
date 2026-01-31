-module(openapi_catalogs_retail_items_filter).

-export([encode/1]).

-export_type([openapi_catalogs_retail_items_filter/0]).

-type openapi_catalogs_retail_items_filter() ::
    #{ 'catalog_id' => binary(),
       'catalog_type' := binary(),
       'item_ids' := list()
     }.

encode(#{ 'catalog_id' := CatalogId,
          'catalog_type' := CatalogType,
          'item_ids' := ItemIds
        }) ->
    #{ 'catalog_id' => CatalogId,
       'catalog_type' => CatalogType,
       'item_ids' => ItemIds
     }.
