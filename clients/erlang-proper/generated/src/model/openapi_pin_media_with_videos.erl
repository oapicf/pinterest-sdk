-module(openapi_pin_media_with_videos).

-include("openapi.hrl").

-export([openapi_pin_media_with_videos/0]).

-export([openapi_pin_media_with_videos/1]).

-export_type([openapi_pin_media_with_videos/0]).

-type openapi_pin_media_with_videos() ::
  [ {'media_type', binary() }
  | {'items', list(openapi_video_metadata:openapi_video_metadata()) }
  ].


openapi_pin_media_with_videos() ->
    openapi_pin_media_with_videos([]).

openapi_pin_media_with_videos(Fields) ->
  Default = [ {'media_type', binary() }
            , {'items', list(openapi_video_metadata:openapi_video_metadata()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

