-module(openapi_catalogs_feed_ingestion_info).

-export([encode/1]).

-export_type([openapi_catalogs_feed_ingestion_info/0]).

-type openapi_catalogs_feed_ingestion_info() ::
    #{ 'IN_STOCK' => integer(),
       'OUT_OF_STOCK' => integer(),
       'PREORDER' => integer()
     }.

encode(#{ 'IN_STOCK' := INSTOCK,
          'OUT_OF_STOCK' := OUTOFSTOCK,
          'PREORDER' := PREORDER
        }) ->
    #{ 'IN_STOCK' => INSTOCK,
       'OUT_OF_STOCK' => OUTOFSTOCK,
       'PREORDER' => PREORDER
     }.
