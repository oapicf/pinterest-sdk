-module(openapi_ad_preview_request).

-export([encode/1]).

-export_type([openapi_ad_preview_request/0]).

-type openapi_ad_preview_request() ::
    #{ 'image_url' := binary(),
       'title' := binary(),
       'pin_id' := binary(),
       'catalog_product_group_id' := binary(),
       'creative_type' := binary(),
       'customizable_cta_type' => openapi_customizable_cta_type:openapi_customizable_cta_type(),
       'hero_image_title' => binary(),
       'hero_image_url' => binary(),
       'hero_pin_id' => binary(),
       'image_tag' => binary(),
       'item_id' => binary(),
       'preferred_media_type' => binary(),
       'video_tag' => binary()
     }.

encode(#{ 'image_url' := ImageUrl,
          'title' := Title,
          'pin_id' := PinId,
          'catalog_product_group_id' := CatalogProductGroupId,
          'creative_type' := CreativeType,
          'customizable_cta_type' := CustomizableCtaType,
          'hero_image_title' := HeroImageTitle,
          'hero_image_url' := HeroImageUrl,
          'hero_pin_id' := HeroPinId,
          'image_tag' := ImageTag,
          'item_id' := ItemId,
          'preferred_media_type' := PreferredMediaType,
          'video_tag' := VideoTag
        }) ->
    #{ 'image_url' => ImageUrl,
       'title' => Title,
       'pin_id' => PinId,
       'catalog_product_group_id' => CatalogProductGroupId,
       'creative_type' => CreativeType,
       'customizable_cta_type' => CustomizableCtaType,
       'hero_image_title' => HeroImageTitle,
       'hero_image_url' => HeroImageUrl,
       'hero_pin_id' => HeroPinId,
       'image_tag' => ImageTag,
       'item_id' => ItemId,
       'preferred_media_type' => PreferredMediaType,
       'video_tag' => VideoTag
     }.
