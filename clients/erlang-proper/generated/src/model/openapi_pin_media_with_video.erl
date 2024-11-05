-module(openapi_pin_media_with_video).

-include("openapi.hrl").

-export([openapi_pin_media_with_video/0]).

-export([openapi_pin_media_with_video/1]).

-export_type([openapi_pin_media_with_video/0]).

-type openapi_pin_media_with_video() ::
  [ {'media_type', binary() }
  | {'images', openapi_pin_media_with_image_all_of_images:openapi_pin_media_with_image_all_of_images() }
  | {'cover_image_url', binary() }
  | {'video_url', binary() }
  | {'duration', integer() }
  | {'height', integer() }
  | {'width', integer() }
  ].


openapi_pin_media_with_video() ->
    openapi_pin_media_with_video([]).

openapi_pin_media_with_video(Fields) ->
  Default = [ {'media_type', binary() }
            , {'images', openapi_pin_media_with_image_all_of_images:openapi_pin_media_with_image_all_of_images() }
            , {'cover_image_url', binary() }
            , {'video_url', binary() }
            , {'duration', integer() }
            , {'height', integer() }
            , {'width', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

