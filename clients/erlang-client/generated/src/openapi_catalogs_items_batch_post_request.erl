-module(openapi_catalogs_items_batch_post_request).

-export([encode/1]).

-export_type([openapi_catalogs_items_batch_post_request/0]).

-type openapi_catalogs_items_batch_post_request() ::
    #{ 'catalog_id' => binary(),
       'catalog_type' := binary(),
       'country' := openapi_country:openapi_country(),
       'items' := list(),
       'language' := binary(),
       'operation' := binary()
     }.

encode(#{ 'catalog_id' := CatalogId,
          'catalog_type' := CatalogType,
          'country' := Country,
          'items' := Items,
          'language' := Language,
          'operation' := Operation
        }) ->
    #{ 'catalog_id' => CatalogId,
       'catalog_type' => CatalogType,
       'country' => Country,
       'items' => Items,
       'language' => Language,
       'operation' => Operation
     }.
