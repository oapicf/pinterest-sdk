-module(openapi_hotel_id_filter).

-export([encode/1]).

-export_type([openapi_hotel_id_filter/0]).

-type openapi_hotel_id_filter() ::
    #{ 'HOTEL_ID' := openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria()
     }.

encode(#{ 'HOTEL_ID' := HOTELID
        }) ->
    #{ 'HOTEL_ID' => HOTELID
     }.
