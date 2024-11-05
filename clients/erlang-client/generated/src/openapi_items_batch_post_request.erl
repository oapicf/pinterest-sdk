-module(openapi_items_batch_post_request).

-export([encode/1]).

-export_type([openapi_items_batch_post_request/0]).

-type openapi_items_batch_post_request() ::
    #{ 'catalog_type' := binary(),
       'country' := openapi_country:openapi_country(),
       'language' := openapi_catalogs_items_request_language:openapi_catalogs_items_request_language(),
       'items' := list(),
       'catalog_id' => binary(),
       'operation' := openapi_batch_operation:openapi_batch_operation()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'country' := Country,
          'language' := Language,
          'items' := Items,
          'catalog_id' := CatalogId,
          'operation' := Operation
        }) ->
    #{ 'catalog_type' => CatalogType,
       'country' => Country,
       'language' => Language,
       'items' => Items,
       'catalog_id' => CatalogId,
       'operation' => Operation
     }.
