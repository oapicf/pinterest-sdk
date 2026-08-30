-module(openapi_promotion).

-export([encode/1]).

-export_type([openapi_promotion/0]).

-type openapi_promotion() ::
    #{ 'ad_account_id' := binary(),
       'discount_status' => openapi_discount_status:openapi_discount_status(),
       'end_time' => integer(),
       'external_id' => binary(),
       'id' := binary(),
       'platform_type' => binary(),
       'promotion_code' => binary(),
       'promotion_custom_id' => binary(),
       'promotion_title' := binary(),
       'promotion_type' := openapi_promotion_type:openapi_promotion_type(),
       'start_time' => integer(),
       'status' => openapi_entity_status:openapi_entity_status(),
       'template_values' => list()
     }.

encode(#{ 'ad_account_id' := AdAccountId,
          'discount_status' := DiscountStatus,
          'end_time' := EndTime,
          'external_id' := ExternalId,
          'id' := Id,
          'platform_type' := PlatformType,
          'promotion_code' := PromotionCode,
          'promotion_custom_id' := PromotionCustomId,
          'promotion_title' := PromotionTitle,
          'promotion_type' := PromotionType,
          'start_time' := StartTime,
          'status' := Status,
          'template_values' := TemplateValues
        }) ->
    #{ 'ad_account_id' => AdAccountId,
       'discount_status' => DiscountStatus,
       'end_time' => EndTime,
       'external_id' => ExternalId,
       'id' => Id,
       'platform_type' => PlatformType,
       'promotion_code' => PromotionCode,
       'promotion_custom_id' => PromotionCustomId,
       'promotion_title' => PromotionTitle,
       'promotion_type' => PromotionType,
       'start_time' => StartTime,
       'status' => Status,
       'template_values' => TemplateValues
     }.
