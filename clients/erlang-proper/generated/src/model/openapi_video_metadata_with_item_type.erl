-module(openapi_video_metadata_with_item_type).

-include("openapi.hrl").

-export([openapi_video_metadata_with_item_type/0]).

-export([openapi_video_metadata_with_item_type/1]).

-export_type([openapi_video_metadata_with_item_type/0]).

-type openapi_video_metadata_with_item_type() ::
  [ {'cover_image_url', binary() }
  | {'duration', integer() }
  | {'height', integer() }
  | {'item_type', binary() }
  | {'video_url', binary() }
  | {'video_url_hls', binary() }
  | {'width', integer() }
  ].


openapi_video_metadata_with_item_type() ->
    openapi_video_metadata_with_item_type([]).

openapi_video_metadata_with_item_type(Fields) ->
  Default = [ {'cover_image_url', binary() }
            , {'duration', integer() }
            , {'height', integer() }
            , {'item_type', elements([<<"video">>]) }
            , {'video_url', binary() }
            , {'video_url_hls', binary() }
            , {'width', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

