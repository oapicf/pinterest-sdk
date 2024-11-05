-module(openapi_catalogs_retail_items_post_filter).

-export([encode/1]).

-export_type([openapi_catalogs_retail_items_post_filter/0]).

-type openapi_catalogs_retail_items_post_filter() ::
    #{ 'catalog_type' := binary(),
       'item_ids' := list(),
       'catalog_id' => binary()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'item_ids' := ItemIds,
          'catalog_id' := CatalogId
        }) ->
    #{ 'catalog_type' => CatalogType,
       'item_ids' => ItemIds,
       'catalog_id' => CatalogId
     }.
