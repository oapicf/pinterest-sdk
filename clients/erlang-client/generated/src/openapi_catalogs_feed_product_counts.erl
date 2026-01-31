-module(openapi_catalogs_feed_product_counts).

-export([encode/1]).

-export_type([openapi_catalogs_feed_product_counts/0]).

-type openapi_catalogs_feed_product_counts() ::
    #{ 'ingested' => integer(),
       'original' => integer()
     }.

encode(#{ 'ingested' := Ingested,
          'original' := Original
        }) ->
    #{ 'ingested' => Ingested,
       'original' => Original
     }.
