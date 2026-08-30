-module(openapi_ineligible_product_tags_error_details).

-export([encode/1]).

-export_type([openapi_ineligible_product_tags_error_details/0]).

-type openapi_ineligible_product_tags_error_details() ::
    #{ 'product_tags' := list()
     }.

encode(#{ 'product_tags' := ProductTags
        }) ->
    #{ 'product_tags' => ProductTags
     }.
