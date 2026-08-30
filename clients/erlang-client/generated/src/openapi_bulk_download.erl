-module(openapi_bulk_download).

-export([encode/1]).

-export_type([openapi_bulk_download/0]).

-type openapi_bulk_download() ::
    #{ 'request_id' => binary()
     }.

encode(#{ 'request_id' := RequestId
        }) ->
    #{ 'request_id' => RequestId
     }.
