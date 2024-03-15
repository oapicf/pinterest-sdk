-module(openapi_google_product_category2_filter).

-export([encode/1]).

-export_type([openapi_google_product_category2_filter/0]).

-type openapi_google_product_category2_filter() ::
    #{ 'GOOGLE_PRODUCT_CATEGORY_2' := openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria()
     }.

encode(#{ 'GOOGLE_PRODUCT_CATEGORY_2' := GOOGLEPRODUCTCATEGORY2
        }) ->
    #{ 'GOOGLE_PRODUCT_CATEGORY_2' => GOOGLEPRODUCTCATEGORY2
     }.
