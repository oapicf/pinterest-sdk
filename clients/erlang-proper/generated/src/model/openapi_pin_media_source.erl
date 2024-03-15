-module(openapi_pin_media_source).

-include("openapi.hrl").

-export([openapi_pin_media_source/0]).

-export([openapi_pin_media_source/1]).

-export_type([openapi_pin_media_source/0]).

-type openapi_pin_media_source() ::
  [ {'source_type', binary() }
  | {'content_type', binary() }
  | {'data', binary() }
  | {'is_standard', boolean() }
  | {'url', binary() }
  | {'cover_image_url', binary() }
  | {'cover_image_content_type', binary() }
  | {'cover_image_data', binary() }
  | {'media_id', binary() }
  | {'items', list(openapi_pin_media_source_images_url_items_inner:openapi_pin_media_source_images_url_items_inner()) }
  | {'index', integer() }
  | {'is_affiliate_link', boolean() }
  ].


openapi_pin_media_source() ->
    openapi_pin_media_source([]).

openapi_pin_media_source(Fields) ->
  Default = [ {'source_type', elements([<<"pin_url">>]) }
            , {'content_type', elements([<<"image/jpeg">>, <<"image/png">>]) }
            , {'data', binary() }
            , {'is_standard', boolean() }
            , {'url', binary() }
            , {'cover_image_url', binary() }
            , {'cover_image_content_type', elements([<<"image/jpeg">>, <<"image/png">>]) }
            , {'cover_image_data', binary() }
            , {'media_id', binary() }
            , {'items', list(openapi_pin_media_source_images_url_items_inner:openapi_pin_media_source_images_url_items_inner(), 2, 5) }
            , {'index', integer(0) }
            , {'is_affiliate_link', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

