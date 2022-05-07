-module(openapi_google_product_category4_filter).

-export([encode/1]).

-export_type([openapi_google_product_category4_filter/0]).

-type openapi_google_product_category4_filter() ::
    #{ 'GOOGLE_PRODUCT_CATEGORY_4' := openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria()
     }.

encode(#{ 'GOOGLE_PRODUCT_CATEGORY_4' := GOOGLEPRODUCTCATEGORY4
        }) ->
    #{ 'GOOGLE_PRODUCT_CATEGORY_4' => GOOGLEPRODUCTCATEGORY4
     }.
