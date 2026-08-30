-module(openapi_ad_preview_request).

-export([encode/1]).

-export_type([openapi_ad_preview_request/0]).

-type openapi_ad_preview_request() ::
    #{ 'image_url' := binary(),
       'promotion_id' => binary(),
       'title' := binary(),
       'creative_type' := openapi_ad_shopping_preview_creative_type:openapi_ad_shopping_preview_creative_type(),
       'pin_id' := binary(),
       'catalog_product_group_id' := binary(),
       'customizable_cta_type' => openapi_customizable_cta_type:openapi_customizable_cta_type(),
       'hero_image_title' => binary(),
       'hero_image_url' => binary(),
       'hero_pin_id' => binary(),
       'image_tag' => binary(),
       'item_id' => binary(),
       'preferred_media_type' => openapi_base_preferred_media_type:openapi_base_preferred_media_type(),
       'show_promotion' => boolean(),
       'video_tag' => binary()
     }.

encode(#{ 'image_url' := ImageUrl,
          'promotion_id' := PromotionId,
          'title' := Title,
          'creative_type' := CreativeType,
          'pin_id' := PinId,
          'catalog_product_group_id' := CatalogProductGroupId,
          'customizable_cta_type' := CustomizableCtaType,
          'hero_image_title' := HeroImageTitle,
          'hero_image_url' := HeroImageUrl,
          'hero_pin_id' := HeroPinId,
          'image_tag' := ImageTag,
          'item_id' := ItemId,
          'preferred_media_type' := PreferredMediaType,
          'show_promotion' := ShowPromotion,
          'video_tag' := VideoTag
        }) ->
    #{ 'image_url' => ImageUrl,
       'promotion_id' => PromotionId,
       'title' => Title,
       'creative_type' => CreativeType,
       'pin_id' => PinId,
       'catalog_product_group_id' => CatalogProductGroupId,
       'customizable_cta_type' => CustomizableCtaType,
       'hero_image_title' => HeroImageTitle,
       'hero_image_url' => HeroImageUrl,
       'hero_pin_id' => HeroPinId,
       'image_tag' => ImageTag,
       'item_id' => ItemId,
       'preferred_media_type' => PreferredMediaType,
       'show_promotion' => ShowPromotion,
       'video_tag' => VideoTag
     }.
