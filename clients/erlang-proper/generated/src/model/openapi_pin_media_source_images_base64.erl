-module(openapi_pin_media_source_images_base64).

-include("openapi.hrl").

-export([openapi_pin_media_source_images_base64/0]).

-export([openapi_pin_media_source_images_base64/1]).

-export_type([openapi_pin_media_source_images_base64/0]).

-type openapi_pin_media_source_images_base64() ::
  [ {'index', integer() }
  | {'items', list(openapi_pin_media_source_images_base64_item:openapi_pin_media_source_images_base64_item()) }
  | {'source_type', binary() }
  ].


openapi_pin_media_source_images_base64() ->
    openapi_pin_media_source_images_base64([]).

openapi_pin_media_source_images_base64(Fields) ->
  Default = [ {'index', integer(0) }
            , {'items', list(openapi_pin_media_source_images_base64_item:openapi_pin_media_source_images_base64_item(), 2, 5) }
            , {'source_type', elements([<<"multiple_image_base64">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

