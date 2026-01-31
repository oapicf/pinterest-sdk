-module(openapi_catalogs_feed_ingestion).

-export([encode/1]).

-export_type([openapi_catalogs_feed_ingestion/0]).

-type openapi_catalogs_feed_ingestion() ::
    #{ 'created_at' := openapi_date_time:openapi_date_time(),
       'feed_id' := binary(),
       'id' := binary(),
       'status' := openapi_catalogs_feed_processing_status:openapi_catalogs_feed_processing_status()
     }.

encode(#{ 'created_at' := CreatedAt,
          'feed_id' := FeedId,
          'id' := Id,
          'status' := Status
        }) ->
    #{ 'created_at' => CreatedAt,
       'feed_id' => FeedId,
       'id' => Id,
       'status' => Status
     }.
