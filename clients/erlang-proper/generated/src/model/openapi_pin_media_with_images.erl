-module(openapi_pin_media_with_images).

-include("openapi.hrl").

-export([openapi_pin_media_with_images/0]).

-export([openapi_pin_media_with_images/1]).

-export_type([openapi_pin_media_with_images/0]).

-type openapi_pin_media_with_images() ::
  [ {'items', list(openapi_image_metadata:openapi_image_metadata()) }
  | {'media_type', binary() }
  ].


openapi_pin_media_with_images() ->
    openapi_pin_media_with_images([]).

openapi_pin_media_with_images(Fields) ->
  Default = [ {'items', list(openapi_image_metadata:openapi_image_metadata()) }
            , {'media_type', elements([<<"multiple_images">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

