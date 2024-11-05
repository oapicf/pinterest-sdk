-module(openapi_catalogs_hotel_items_post_filter).

-export([encode/1]).

-export_type([openapi_catalogs_hotel_items_post_filter/0]).

-type openapi_catalogs_hotel_items_post_filter() ::
    #{ 'catalog_type' := binary(),
       'hotel_ids' := list(),
       'catalog_id' => binary()
     }.

encode(#{ 'catalog_type' := CatalogType,
          'hotel_ids' := HotelIds,
          'catalog_id' := CatalogId
        }) ->
    #{ 'catalog_type' => CatalogType,
       'hotel_ids' => HotelIds,
       'catalog_id' => CatalogId
     }.
