-module(openapi_catalogs_hotel_batch_request).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_batch_request/0]).

-type openapi_catalogs_hotel_batch_request() ::
    #{ 'catalog_type' := openapi_catalogs_type:openapi_catalogs_type(),
       'country' := openapi_country:openapi_country(),
       'language' := openapi_language:openapi_language(),
       'items' := list(),
       'catalog_id' => binary()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'country' := Country,
          'language' := Language,
          'items' := Items,
          'catalog_id' := CatalogId
        }) ->
    #{ 'catalog_type' => CatalogType,
       'country' => Country,
       'language' => Language,
       'items' => Items,
       'catalog_id' => CatalogId
     }.
