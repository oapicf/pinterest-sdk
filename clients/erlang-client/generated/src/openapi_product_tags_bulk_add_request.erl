-module(openapi_product_tags_bulk_add_request).

-export([encode/1]).

-export_type([openapi_product_tags_bulk_add_request/0]).

-type openapi_product_tags_bulk_add_request() ::
    #{ 'product_tags' := list()
     }.

encode(#{ 'product_tags' := ProductTags
        }) ->
    #{ 'product_tags' => ProductTags
     }.
