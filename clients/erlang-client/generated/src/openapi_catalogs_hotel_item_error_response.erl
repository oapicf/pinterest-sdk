-module(openapi_catalogs_hotel_item_error_response).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_item_error_response/0]).

-type openapi_catalogs_hotel_item_error_response() ::
    #{ 'catalog_type' := binary(),
       'errors' := list(),
       'hotel_id' => binary(),
       'item_response_kind' := binary()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'errors' := Errors,
          'hotel_id' := HotelId,
          'item_response_kind' := ItemResponseKind
        }) ->
    #{ 'catalog_type' => CatalogType,
       'errors' => Errors,
       'hotel_id' => HotelId,
       'item_response_kind' => ItemResponseKind
     }.
