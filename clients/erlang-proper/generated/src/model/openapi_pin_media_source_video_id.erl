-module(openapi_pin_media_source_video_id).

-include("openapi.hrl").

-export([openapi_pin_media_source_video_id/0]).

-export([openapi_pin_media_source_video_id/1]).

-export_type([openapi_pin_media_source_video_id/0]).

-type openapi_pin_media_source_video_id() ::
  [ {'source_type', binary() }
  | {'cover_image_url', binary() }
  | {'cover_image_content_type', binary() }
  | {'cover_image_data', binary() }
  | {'media_id', binary() }
  | {'is_standard', boolean() }
  ].


openapi_pin_media_source_video_id() ->
    openapi_pin_media_source_video_id([]).

openapi_pin_media_source_video_id(Fields) ->
  Default = [ {'source_type', elements([<<"video_id">>]) }
            , {'cover_image_url', binary() }
            , {'cover_image_content_type', elements([<<"image/jpeg">>, <<"image/png">>]) }
            , {'cover_image_data', binary() }
            , {'media_id', binary() }
            , {'is_standard', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

