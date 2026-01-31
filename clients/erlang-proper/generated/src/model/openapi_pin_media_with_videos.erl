-module(openapi_pin_media_with_videos).

-include("openapi.hrl").

-export([openapi_pin_media_with_videos/0]).

-export([openapi_pin_media_with_videos/1]).

-export_type([openapi_pin_media_with_videos/0]).

-type openapi_pin_media_with_videos() ::
  [ {'items', list(openapi_video_metadata_with_item_type:openapi_video_metadata_with_item_type()) }
  | {'media_type', binary() }
  ].


openapi_pin_media_with_videos() ->
    openapi_pin_media_with_videos([]).

openapi_pin_media_with_videos(Fields) ->
  Default = [ {'items', list(openapi_video_metadata_with_item_type:openapi_video_metadata_with_item_type()) }
            , {'media_type', elements([<<"multiple_videos">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

