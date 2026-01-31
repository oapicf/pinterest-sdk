-module(openapi_catalogs_feed_video_counts).

-export([encode/1]).

-export_type([openapi_catalogs_feed_video_counts/0]).

-type openapi_catalogs_feed_video_counts() ::
    #{ 'ingested_videos' => integer(),
       'not_ingested_videos' => integer(),
       'total_videos' => integer()
     }.

encode(#{ 'ingested_videos' := IngestedVideos,
          'not_ingested_videos' := NotIngestedVideos,
          'total_videos' := TotalVideos
        }) ->
    #{ 'ingested_videos' => IngestedVideos,
       'not_ingested_videos' => NotIngestedVideos,
       'total_videos' => TotalVideos
     }.
