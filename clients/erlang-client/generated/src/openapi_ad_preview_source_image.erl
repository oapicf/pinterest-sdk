-module(openapi_ad_preview_source_image).

-export([encode/1]).

-export_type([openapi_ad_preview_source_image/0]).

-type openapi_ad_preview_source_image() ::
    #{ 'image_url' := binary(),
       'promotion_id' => binary(),
       'title' := binary()
     }.

encode(#{ 'image_url' := ImageUrl,
          'promotion_id' := PromotionId,
          'title' := Title
        }) ->
    #{ 'image_url' => ImageUrl,
       'promotion_id' => PromotionId,
       'title' => Title
     }.
