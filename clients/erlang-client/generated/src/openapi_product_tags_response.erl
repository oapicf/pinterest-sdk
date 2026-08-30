-module(openapi_product_tags_response).

-export([encode/1]).

-export_type([openapi_product_tags_response/0]).

-type openapi_product_tags_response() ::
    #{ 'product_tags' := list()
     }.

encode(#{ 'product_tags' := ProductTags
        }) ->
    #{ 'product_tags' => ProductTags
     }.
