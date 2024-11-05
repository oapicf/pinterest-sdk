-module(openapi_catalogs_feed_ingestion).

-export([encode/1]).

-export_type([openapi_catalogs_feed_ingestion/0]).

-type openapi_catalogs_feed_ingestion() ::
    #{ 'id' := binary(),
       'feed_id' := binary(),
       'created_at' := openapi_date_time:openapi_date_time(),
       'status' := openapi_catalogs_feed_processing_status:openapi_catalogs_feed_processing_status()
     }.

encode(#{ 'id' := Id,
          'feed_id' := FeedId,
          'created_at' := CreatedAt,
          'status' := Status
        }) ->
    #{ 'id' => Id,
       'feed_id' => FeedId,
       'created_at' => CreatedAt,
       'status' => Status
     }.
