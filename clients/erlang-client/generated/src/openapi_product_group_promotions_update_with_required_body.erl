-module(openapi_product_group_promotions_update_with_required_body).

-export([encode/1]).

-export_type([openapi_product_group_promotions_update_with_required_body/0]).

-type openapi_product_group_promotions_update_with_required_body() ::
    #{ 'ad_group_id' := binary(),
       'product_group_promotion' := list()
     }.

encode(#{ 'ad_group_id' := AdGroupId,
          'product_group_promotion' := ProductGroupPromotion
        }) ->
    #{ 'ad_group_id' => AdGroupId,
       'product_group_promotion' => ProductGroupPromotion
     }.
