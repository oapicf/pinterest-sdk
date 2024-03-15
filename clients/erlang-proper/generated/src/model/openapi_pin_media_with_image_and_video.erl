-module(openapi_pin_media_with_image_and_video).

-include("openapi.hrl").

-export([openapi_pin_media_with_image_and_video/0]).

-export([openapi_pin_media_with_image_and_video/1]).

-export_type([openapi_pin_media_with_image_and_video/0]).

-type openapi_pin_media_with_image_and_video() ::
  [ {'media_type', binary() }
  | {'items', list(openapi_pin_media_metadata:openapi_pin_media_metadata()) }
  ].


openapi_pin_media_with_image_and_video() ->
    openapi_pin_media_with_image_and_video([]).

openapi_pin_media_with_image_and_video(Fields) ->
  Default = [ {'media_type', binary() }
            , {'items', list(openapi_pin_media_metadata:openapi_pin_media_metadata()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

