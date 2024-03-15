-module(openapi_bulk_upsert_request).

-export([encode/1]).

-export_type([openapi_bulk_upsert_request/0]).

-type openapi_bulk_upsert_request() ::
    #{ 'create' => openapi_bulk_upsert_request_create:openapi_bulk_upsert_request_create(),
       'update' => openapi_bulk_upsert_request_update:openapi_bulk_upsert_request_update()
     }.

encode(#{ 'create' := Create,
          'update' := Update
        }) ->
    #{ 'create' => Create,
       'update' => Update
     }.
