-module(openapi_catalogs_db_item).

-export([encode/1]).

-export_type([openapi_catalogs_db_item/0]).

-type openapi_catalogs_db_item() ::
    #{ 'created_at' := openapi_date_time:openapi_date_time(),
       'id' := binary(),
       'updated_at' := openapi_date_time:openapi_date_time()
     }.

encode(#{ 'created_at' := CreatedAt,
          'id' := Id,
          'updated_at' := UpdatedAt
        }) ->
    #{ 'created_at' => CreatedAt,
       'id' => Id,
       'updated_at' => UpdatedAt
     }.
