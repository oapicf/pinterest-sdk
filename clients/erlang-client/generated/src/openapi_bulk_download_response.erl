-module(openapi_bulk_download_response).

-export([encode/1]).

-export_type([openapi_bulk_download_response/0]).

-type openapi_bulk_download_response() ::
    #{ 'request_id' => binary()
     }.

encode(#{ 'request_id' := RequestId
        }) ->
    #{ 'request_id' => RequestId
     }.
