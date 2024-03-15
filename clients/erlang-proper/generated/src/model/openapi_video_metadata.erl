-module(openapi_video_metadata).

-include("openapi.hrl").

-export([openapi_video_metadata/0]).

-export([openapi_video_metadata/1]).

-export_type([openapi_video_metadata/0]).

-type openapi_video_metadata() ::
  [ {'item_type', binary() }
  | {'cover_image_url', binary() }
  | {'video_url', binary() }
  | {'duration', integer() }
  | {'height', integer() }
  | {'width', integer() }
  ].


openapi_video_metadata() ->
    openapi_video_metadata([]).

openapi_video_metadata(Fields) ->
  Default = [ {'item_type', binary() }
            , {'cover_image_url', binary() }
            , {'video_url', binary() }
            , {'duration', integer() }
            , {'height', integer() }
            , {'width', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

