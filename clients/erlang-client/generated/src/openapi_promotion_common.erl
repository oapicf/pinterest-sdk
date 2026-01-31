-module(openapi_promotion_common).

-export([encode/1]).

-export_type([openapi_promotion_common/0]).

-type openapi_promotion_common() ::
    #{ 'discount_status' => binary(),
       'end_time' => integer(),
       'external_id' => binary(),
       'platform_type' => binary(),
       'promotion_code' => binary(),
       'promotion_custom_id' => binary(),
       'promotion_title' => binary(),
       'promotion_type' => openapi_promotion_type:openapi_promotion_type(),
       'start_time' => integer(),
       'template_values' => list()
     }.

encode(#{ 'discount_status' := DiscountStatus,
          'end_time' := EndTime,
          'external_id' := ExternalId,
          'platform_type' := PlatformType,
          'promotion_code' := PromotionCode,
          'promotion_custom_id' := PromotionCustomId,
          'promotion_title' := PromotionTitle,
          'promotion_type' := PromotionType,
          'start_time' := StartTime,
          'template_values' := TemplateValues
        }) ->
    #{ 'discount_status' => DiscountStatus,
       'end_time' => EndTime,
       'external_id' => ExternalId,
       'platform_type' => PlatformType,
       'promotion_code' => PromotionCode,
       'promotion_custom_id' => PromotionCustomId,
       'promotion_title' => PromotionTitle,
       'promotion_type' => PromotionType,
       'start_time' => StartTime,
       'template_values' => TemplateValues
     }.
