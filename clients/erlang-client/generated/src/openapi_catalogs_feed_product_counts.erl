-module(openapi_catalogs_feed_product_counts).

-export([encode/1]).

-export_type([openapi_catalogs_feed_product_counts/0]).

-type openapi_catalogs_feed_product_counts() ::
    #{ 'original' => integer()
     }.

encode(#{ 'original' := Original
        }) ->
    #{ 'original' => Original
     }.
