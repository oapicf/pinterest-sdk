-module(openapi_google_product_category0_filter).

-export([encode/1]).

-export_type([openapi_google_product_category0_filter/0]).

-type openapi_google_product_category0_filter() ::
    #{ 'GOOGLE_PRODUCT_CATEGORY_0' := openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria()
     }.

encode(#{ 'GOOGLE_PRODUCT_CATEGORY_0' := GOOGLEPRODUCTCATEGORY0
        }) ->
    #{ 'GOOGLE_PRODUCT_CATEGORY_0' => GOOGLEPRODUCTCATEGORY0
     }.
