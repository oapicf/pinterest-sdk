-module(openapi_product_group_promotion_create_request).

-export([encode/1]).

-export_type([openapi_product_group_promotion_create_request/0]).

-type openapi_product_group_promotion_create_request() ::
    #{ 'ad_group_id' := binary(),
       'product_group_promotion' := list()
     }.

encode(#{ 'ad_group_id' := AdGroupId,
          'product_group_promotion' := ProductGroupPromotion
        }) ->
    #{ 'ad_group_id' => AdGroupId,
       'product_group_promotion' => ProductGroupPromotion
     }.
