-module(openapi_pin_media).

-include("openapi.hrl").

-export([openapi_pin_media/0]).

-export([openapi_pin_media/1]).

-export_type([openapi_pin_media/0]).

-type openapi_pin_media() ::
  [ {'images', openapi_image_size:openapi_image_size() }
  | {'media_type', binary() }
  | {'cover_image_url', binary() }
  | {'duration', integer() }
  | {'height', integer() }
  | {'video_url', binary() }
  | {'video_url_hls', binary() }
  | {'width', integer() }
  | {'items', list(openapi_pin_media_metadata:openapi_pin_media_metadata()) }
  ].


openapi_pin_media() ->
    openapi_pin_media([]).

openapi_pin_media(Fields) ->
  Default = [ {'images', openapi_image_size:openapi_image_size() }
            , {'media_type', elements([<<"multiple_mixed">>]) }
            , {'cover_image_url', binary() }
            , {'duration', integer() }
            , {'height', integer() }
            , {'video_url', binary() }
            , {'video_url_hls', binary() }
            , {'width', integer() }
            , {'items', list(openapi_pin_media_metadata:openapi_pin_media_metadata()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

