-module(openapi_catalogs_retail_batch_request).

-export([encode/1]).

-export_type([openapi_catalogs_retail_batch_request/0]).

-type openapi_catalogs_retail_batch_request() ::
    #{ 'catalog_type' := binary(),
       'country' := openapi_country:openapi_country(),
       'language' := openapi_catalogs_items_request_language:openapi_catalogs_items_request_language(),
       'items' := list()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'country' := Country,
          'language' := Language,
          'items' := Items
        }) ->
    #{ 'catalog_type' => CatalogType,
       'country' => Country,
       'language' => Language,
       'items' => Items
     }.
