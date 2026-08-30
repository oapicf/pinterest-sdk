-module(openapi_product_tags_bulk_delete_request).

-export([encode/1]).

-export_type([openapi_product_tags_bulk_delete_request/0]).

-type openapi_product_tags_bulk_delete_request() ::
    #{ 'product_tags' := list()
     }.

encode(#{ 'product_tags' := ProductTags
        }) ->
    #{ 'product_tags' => ProductTags
     }.
