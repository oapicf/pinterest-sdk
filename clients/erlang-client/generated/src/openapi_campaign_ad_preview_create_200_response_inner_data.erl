-module(openapi_campaign_ad_preview_create_200_response_inner_data).

-export([encode/1]).

-export_type([openapi_campaign_ad_preview_create_200_response_inner_data/0]).

-type openapi_campaign_ad_preview_create_200_response_inner_data() ::
    #{ 'ad_account_id' := binary(),
       'ad_group_id' := binary(),
       'client_id' => integer(),
       'expires_at' := integer(),
       'is_active' := boolean(),
       'pin_id' => integer(),
       'pin_promotion_id' => integer(),
       'promoted_product_group_id' => integer(),
       'url' := binary(),
       'user_id' := integer(),
       'uuid' := binary(),
       'exceptions' := openapi_pinterest_lib_error:openapi_pinterest_lib_error()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'ad_group_id' := AdGroupId,
          'client_id' := ClientId,
          'expires_at' := ExpiresAt,
          'is_active' := IsActive,
          'pin_id' := PinId,
          'pin_promotion_id' := PinPromotionId,
          'promoted_product_group_id' := PromotedProductGroupId,
          'url' := Url,
          'user_id' := UserId,
          'uuid' := Uuid,
          'exceptions' := Exceptions
        }) ->
    #{ 'ad_account_id' => AdAccountId,
       'ad_group_id' => AdGroupId,
       'client_id' => ClientId,
       'expires_at' => ExpiresAt,
       'is_active' => IsActive,
       'pin_id' => PinId,
       'pin_promotion_id' => PinPromotionId,
       'promoted_product_group_id' => PromotedProductGroupId,
       'url' => Url,
       'user_id' => UserId,
       'uuid' => Uuid,
       'exceptions' => Exceptions
     }.
