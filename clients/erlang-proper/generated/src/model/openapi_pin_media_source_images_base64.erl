-module(openapi_pin_media_source_images_base64).

-include("openapi.hrl").

-export([openapi_pin_media_source_images_base64/0]).

-export([openapi_pin_media_source_images_base64/1]).

-export_type([openapi_pin_media_source_images_base64/0]).

-type openapi_pin_media_source_images_base64() ::
  [ {'source_type', binary() }
  | {'items', list(openapi_pin_media_source_images_base64_items_inner:openapi_pin_media_source_images_base64_items_inner()) }
  | {'index', integer() }
  ].


openapi_pin_media_source_images_base64() ->
    openapi_pin_media_source_images_base64([]).

openapi_pin_media_source_images_base64(Fields) ->
  Default = [ {'source_type', elements([<<"multiple_image_base64">>]) }
            , {'items', list(openapi_pin_media_source_images_base64_items_inner:openapi_pin_media_source_images_base64_items_inner(), 2, 5) }
            , {'index', integer(0) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

