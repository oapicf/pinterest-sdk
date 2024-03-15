-module(openapi_product_group_promotion_response_item).

-export([encode/1]).

-export_type([openapi_product_group_promotion_response_item/0]).

-type openapi_product_group_promotion_response_item() ::
    #{ 'data' => openapi_product_group_promotion:openapi_product_group_promotion(),
       'exceptions' => list()
     }.

encode(#{ 'data' := Data,
          'exceptions' := Exceptions
        }) ->
    #{ 'data' => Data,
       'exceptions' => Exceptions
     }.
