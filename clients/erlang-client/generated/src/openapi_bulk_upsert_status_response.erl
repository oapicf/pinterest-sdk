-module(openapi_bulk_upsert_status_response).

-export([encode/1]).

-export_type([openapi_bulk_upsert_status_response/0]).

-type openapi_bulk_upsert_status_response() ::
    #{ 'status' => openapi_bulk_upsert_status:openapi_bulk_upsert_status(),
       'result_url' => binary()
     }.

encode(#{ 'status' := Status,
          'result_url' := ResultUrl
        }) ->
    #{ 'status' => Status,
       'result_url' => ResultUrl
     }.
