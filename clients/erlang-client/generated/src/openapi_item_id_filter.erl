-module(openapi_item_id_filter).

-export([encode/1]).

-export_type([openapi_item_id_filter/0]).

-type openapi_item_id_filter() ::
    #{ 'ITEM_ID' := openapi_catalogs_product_group_multiple_string_criteria:openapi_catalogs_product_group_multiple_string_criteria()
     }.

encode(#{ 'ITEM_ID' := ITEMID
        }) ->
    #{ 'ITEM_ID' => ITEMID
     }.
