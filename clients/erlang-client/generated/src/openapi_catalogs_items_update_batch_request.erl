-module(openapi_catalogs_items_update_batch_request).

-export([encode/1]).

-export_type([openapi_catalogs_items_update_batch_request/0]).

-type openapi_catalogs_items_update_batch_request() ::
    #{ 'country' := openapi_country:openapi_country(),
       'items' := list(),
       'language' := binary(),
       'operation' := binary()
     }.

encode(#{ 'country' := Country,
          'items' := Items,
          'language' := Language,
          'operation' := Operation
        }) ->
    #{ 'country' => Country,
       'items' => Items,
       'language' => Language,
       'operation' => Operation
     }.
