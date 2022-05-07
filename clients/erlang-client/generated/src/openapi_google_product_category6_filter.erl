-module(openapi_google_product_category6_filter).

-export([encode/1]).

-export_type([openapi_google_product_category6_filter/0]).

-type openapi_google_product_category6_filter() ::
    #{ 'GOOGLE_PRODUCT_CATEGORY_6' := openapi_catalogs_product_group_multiple_string_list_criteria:openapi_catalogs_product_group_multiple_string_list_criteria()
     }.

encode(#{ 'GOOGLE_PRODUCT_CATEGORY_6' := GOOGLEPRODUCTCATEGORY6
        }) ->
    #{ 'GOOGLE_PRODUCT_CATEGORY_6' => GOOGLEPRODUCTCATEGORY6
     }.
