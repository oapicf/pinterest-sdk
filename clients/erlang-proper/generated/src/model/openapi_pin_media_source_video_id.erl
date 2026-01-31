-module(openapi_pin_media_source_video_id).

-include("openapi.hrl").

-export([openapi_pin_media_source_video_id/0]).

-export([openapi_pin_media_source_video_id/1]).

-export_type([openapi_pin_media_source_video_id/0]).

-type openapi_pin_media_source_video_id() ::
  [ {'cover_image_content_type', openapi_content_type:openapi_content_type() }
  | {'cover_image_data', binary() }
  | {'cover_image_key_frame_time', integer() }
  | {'cover_image_url', binary() }
  | {'is_standard', boolean() }
  | {'media_id', binary() }
  | {'source_type', binary() }
  ].


openapi_pin_media_source_video_id() ->
    openapi_pin_media_source_video_id([]).

openapi_pin_media_source_video_id(Fields) ->
  Default = [ {'cover_image_content_type', openapi_content_type:openapi_content_type() }
            , {'cover_image_data', binary() }
            , {'cover_image_key_frame_time', integer(0) }
            , {'cover_image_url', binary() }
            , {'is_standard', boolean() }
            , {'media_id', binary() }
            , {'source_type', elements([<<"video_id">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

