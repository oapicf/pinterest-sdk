-module(openapi_catalogs_retail_item_error_response).

-export([encode/1]).

-export_type([openapi_catalogs_retail_item_error_response/0]).

-type openapi_catalogs_retail_item_error_response() ::
    #{ 'catalog_type' := openapi_catalogs_type:openapi_catalogs_type(),
       'item_id' => binary(),
       'errors' => list()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'item_id' := ItemId,
          'errors' := Errors
        }) ->
    #{ 'catalog_type' => CatalogType,
       'item_id' => ItemId,
       'errors' => Errors
     }.
