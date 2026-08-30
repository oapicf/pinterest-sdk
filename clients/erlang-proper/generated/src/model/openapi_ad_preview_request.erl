-module(openapi_ad_preview_request).

-include("openapi.hrl").

-export([openapi_ad_preview_request/0]).

-export([openapi_ad_preview_request/1]).

-export_type([openapi_ad_preview_request/0]).

-type openapi_ad_preview_request() ::
  [ {'image_url', binary() }
  | {'promotion_id', binary() }
  | {'title', binary() }
  | {'creative_type', openapi_ad_shopping_preview_creative_type:openapi_ad_shopping_preview_creative_type() }
  | {'pin_id', binary() }
  | {'catalog_product_group_id', binary() }
  | {'customizable_cta_type', openapi_customizable_cta_type:openapi_customizable_cta_type() }
  | {'hero_image_title', binary() }
  | {'hero_image_url', binary() }
  | {'hero_pin_id', binary() }
  | {'image_tag', binary() }
  | {'item_id', binary() }
  | {'preferred_media_type', openapi_base_preferred_media_type:openapi_base_preferred_media_type() }
  | {'show_promotion', boolean() }
  | {'video_tag', binary() }
  ].


openapi_ad_preview_request() ->
    openapi_ad_preview_request([]).

openapi_ad_preview_request(Fields) ->
  Default = [ {'image_url', binary() }
            , {'promotion_id', binary() }
            , {'title', binary() }
            , {'creative_type', openapi_ad_shopping_preview_creative_type:openapi_ad_shopping_preview_creative_type() }
            , {'pin_id', binary() }
            , {'catalog_product_group_id', binary() }
            , {'customizable_cta_type', openapi_customizable_cta_type:openapi_customizable_cta_type() }
            , {'hero_image_title', binary() }
            , {'hero_image_url', binary() }
            , {'hero_pin_id', binary() }
            , {'image_tag', binary() }
            , {'item_id', binary() }
            , {'preferred_media_type', openapi_base_preferred_media_type:openapi_base_preferred_media_type() }
            , {'show_promotion', boolean() }
            , {'video_tag', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

