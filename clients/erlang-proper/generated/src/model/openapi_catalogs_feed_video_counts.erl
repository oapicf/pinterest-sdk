-module(openapi_catalogs_feed_video_counts).

-include("openapi.hrl").

-export([openapi_catalogs_feed_video_counts/0]).

-export([openapi_catalogs_feed_video_counts/1]).

-export_type([openapi_catalogs_feed_video_counts/0]).

-type openapi_catalogs_feed_video_counts() ::
  [ {'ingested_videos', integer() }
  | {'not_ingested_videos', integer() }
  | {'total_videos', integer() }
  ].


openapi_catalogs_feed_video_counts() ->
    openapi_catalogs_feed_video_counts([]).

openapi_catalogs_feed_video_counts(Fields) ->
  Default = [ {'ingested_videos', integer() }
            , {'not_ingested_videos', integer() }
            , {'total_videos', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

