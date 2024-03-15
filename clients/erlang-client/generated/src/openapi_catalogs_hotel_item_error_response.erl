-module(openapi_catalogs_hotel_item_error_response).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_item_error_response/0]).

-type openapi_catalogs_hotel_item_error_response() ::
    #{ 'catalog_type' := openapi_catalogs_type:openapi_catalogs_type(),
       'hotel_id' => binary(),
       'errors' => list()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'hotel_id' := HotelId,
          'errors' := Errors
        }) ->
    #{ 'catalog_type' => CatalogType,
       'hotel_id' => HotelId,
       'errors' => Errors
     }.
