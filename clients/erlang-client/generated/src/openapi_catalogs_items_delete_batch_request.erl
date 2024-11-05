-module(openapi_catalogs_items_delete_batch_request).

-export([encode/1]).

-export_type([openapi_catalogs_items_delete_batch_request/0]).

-type openapi_catalogs_items_delete_batch_request() ::
    #{ 'country' := openapi_country:openapi_country(),
       'language' := openapi_catalogs_items_request_language:openapi_catalogs_items_request_language(),
       'operation' := openapi_batch_operation:openapi_batch_operation(),
       'items' := list()
     }.

encode(#{ 'country' := Country,
          'language' := Language,
          'operation' := Operation,
          'items' := Items
        }) ->
    #{ 'country' => Country,
       'language' => Language,
       'operation' => Operation,
       'items' => Items
     }.
