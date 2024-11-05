-module(openapi_pin_media_with_image).

-include("openapi.hrl").

-export([openapi_pin_media_with_image/0]).

-export([openapi_pin_media_with_image/1]).

-export_type([openapi_pin_media_with_image/0]).

-type openapi_pin_media_with_image() ::
  [ {'media_type', binary() }
  | {'images', openapi_pin_media_with_image_all_of_images:openapi_pin_media_with_image_all_of_images() }
  ].


openapi_pin_media_with_image() ->
    openapi_pin_media_with_image([]).

openapi_pin_media_with_image(Fields) ->
  Default = [ {'media_type', binary() }
            , {'images', openapi_pin_media_with_image_all_of_images:openapi_pin_media_with_image_all_of_images() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

