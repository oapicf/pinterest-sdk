-module(openapi_pin_media_with_image).

-include("openapi.hrl").

-export([openapi_pin_media_with_image/0]).

-export([openapi_pin_media_with_image/1]).

-export_type([openapi_pin_media_with_image/0]).

-type openapi_pin_media_with_image() ::
  [ {'images', openapi_image_size:openapi_image_size() }
  | {'media_type', binary() }
  ].


openapi_pin_media_with_image() ->
    openapi_pin_media_with_image([]).

openapi_pin_media_with_image(Fields) ->
  Default = [ {'images', openapi_image_size:openapi_image_size() }
            , {'media_type', elements([<<"image">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

