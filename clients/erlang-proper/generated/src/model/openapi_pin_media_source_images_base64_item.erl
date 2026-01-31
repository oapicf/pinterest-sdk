-module(openapi_pin_media_source_images_base64_item).

-include("openapi.hrl").

-export([openapi_pin_media_source_images_base64_item/0]).

-export([openapi_pin_media_source_images_base64_item/1]).

-export_type([openapi_pin_media_source_images_base64_item/0]).

-type openapi_pin_media_source_images_base64_item() ::
  [ {'content_type', openapi_content_type:openapi_content_type() }
  | {'data', binary() }
  | {'description', binary() }
  | {'link', binary() }
  | {'title', binary() }
  ].


openapi_pin_media_source_images_base64_item() ->
    openapi_pin_media_source_images_base64_item([]).

openapi_pin_media_source_images_base64_item(Fields) ->
  Default = [ {'content_type', openapi_content_type:openapi_content_type() }
            , {'data', binary() }
            , {'description', binary() }
            , {'link', binary() }
            , {'title', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

