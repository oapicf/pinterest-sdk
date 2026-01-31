-module(openapi_bulk_upsert_status_response).

-export([encode/1]).

-export_type([openapi_bulk_upsert_status_response/0]).

-type openapi_bulk_upsert_status_response() ::
    #{ 'result_url' => binary(),
       'status' => openapi_bulk_upsert_status:openapi_bulk_upsert_status()
     }.

encode(#{ 'result_url' := ResultUrl,
          'status' := Status
        }) ->
    #{ 'result_url' => ResultUrl,
       'status' => Status
     }.
