-module(openapi_pinterest_product_categories_filter).

-export([encode/1]).

-export_type([openapi_pinterest_product_categories_filter/0]).

-type openapi_pinterest_product_categories_filter() ::
    #{ 'PINTEREST_PRODUCT_CATEGORIES' := openapi_catalogs_product_group_multiple_pinterest_product_category_criteria:openapi_catalogs_product_group_multiple_pinterest_product_category_criteria()
     }.

encode(#{ 'PINTEREST_PRODUCT_CATEGORIES' := PINTERESTPRODUCTCATEGORIES
        }) ->
    #{ 'PINTEREST_PRODUCT_CATEGORIES' => PINTERESTPRODUCTCATEGORIES
     }.
