-module(openapi_pin_media_source).

-include("openapi.hrl").

-export([openapi_pin_media_source/0]).

-export([openapi_pin_media_source/1]).

-export_type([openapi_pin_media_source/0]).

-type openapi_pin_media_source() ::
  [ {'content_type', openapi_content_type:openapi_content_type() }
  | {'data', binary() }
  | {'is_standard', boolean() }
  | {'source_type', binary() }
  | {'url', binary() }
  | {'cover_image_content_type', openapi_content_type:openapi_content_type() }
  | {'cover_image_data', binary() }
  | {'cover_image_key_frame_time', integer() }
  | {'cover_image_url', binary() }
  | {'media_id', binary() }
  | {'index', integer() }
  | {'items', list(openapi_pin_media_source_images_url_item:openapi_pin_media_source_images_url_item()) }
  | {'is_affiliate_link', boolean() }
  ].


openapi_pin_media_source() ->
    openapi_pin_media_source([]).

openapi_pin_media_source(Fields) ->
  Default = [ {'content_type', openapi_content_type:openapi_content_type() }
            , {'data', binary() }
            , {'is_standard', boolean() }
            , {'source_type', elements([<<"pin_url">>]) }
            , {'url', binary() }
            , {'cover_image_content_type', openapi_content_type:openapi_content_type() }
            , {'cover_image_data', binary() }
            , {'cover_image_key_frame_time', integer(0) }
            , {'cover_image_url', binary() }
            , {'media_id', binary() }
            , {'index', integer(0) }
            , {'items', list(openapi_pin_media_source_images_url_item:openapi_pin_media_source_images_url_item(), 2, 5) }
            , {'is_affiliate_link', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

