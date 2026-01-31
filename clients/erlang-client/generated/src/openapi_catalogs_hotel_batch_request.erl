-module(openapi_catalogs_hotel_batch_request).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_batch_request/0]).

-type openapi_catalogs_hotel_batch_request() ::
    #{ 'catalog_id' => binary(),
       'catalog_type' := binary(),
       'country' := openapi_country:openapi_country(),
       'items' := list(),
       'language' := binary()
     }.

encode(#{ 'catalog_id' := CatalogId,
          'catalog_type' := CatalogType,
          'country' := Country,
          'items' := Items,
          'language' := Language
        }) ->
    #{ 'catalog_id' => CatalogId,
       'catalog_type' => CatalogType,
       'country' => Country,
       'items' => Items,
       'language' => Language
     }.
