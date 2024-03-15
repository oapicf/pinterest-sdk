-module(openapi_pin_media_with_images).

-include("openapi.hrl").

-export([openapi_pin_media_with_images/0]).

-export([openapi_pin_media_with_images/1]).

-export_type([openapi_pin_media_with_images/0]).

-type openapi_pin_media_with_images() ::
  [ {'media_type', binary() }
  | {'items', list(openapi_image_metadata:openapi_image_metadata()) }
  ].


openapi_pin_media_with_images() ->
    openapi_pin_media_with_images([]).

openapi_pin_media_with_images(Fields) ->
  Default = [ {'media_type', binary() }
            , {'items', list(openapi_image_metadata:openapi_image_metadata()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

