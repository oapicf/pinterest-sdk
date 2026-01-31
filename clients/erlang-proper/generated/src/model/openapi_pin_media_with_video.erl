-module(openapi_pin_media_with_video).

-include("openapi.hrl").

-export([openapi_pin_media_with_video/0]).

-export([openapi_pin_media_with_video/1]).

-export_type([openapi_pin_media_with_video/0]).

-type openapi_pin_media_with_video() ::
  [ {'cover_image_url', binary() }
  | {'duration', integer() }
  | {'height', integer() }
  | {'images', openapi_image_size:openapi_image_size() }
  | {'media_type', binary() }
  | {'video_url', binary() }
  | {'width', integer() }
  ].


openapi_pin_media_with_video() ->
    openapi_pin_media_with_video([]).

openapi_pin_media_with_video(Fields) ->
  Default = [ {'cover_image_url', binary() }
            , {'duration', integer() }
            , {'height', integer() }
            , {'images', openapi_image_size:openapi_image_size() }
            , {'media_type', elements([<<"video">>]) }
            , {'video_url', binary() }
            , {'width', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

