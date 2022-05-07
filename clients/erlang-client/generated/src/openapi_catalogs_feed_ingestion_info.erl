-module(openapi_catalogs_feed_ingestion_info).

-export([encode/1]).

-export_type([openapi_catalogs_feed_ingestion_info/0]).

-type openapi_catalogs_feed_ingestion_info() ::
    #{ 'in_stock' => integer(),
       'out_of_stock' => integer(),
       'preorder' => integer()
     }.

encode(#{ 'in_stock' := InStock,
          'out_of_stock' := OutOfStock,
          'preorder' := Preorder
        }) ->
    #{ 'in_stock' => InStock,
       'out_of_stock' => OutOfStock,
       'preorder' => Preorder
     }.
