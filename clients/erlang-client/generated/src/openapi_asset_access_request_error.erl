-module(openapi_asset_access_request_error).

-export([encode/1]).

-export_type([openapi_asset_access_request_error/0]).

-type openapi_asset_access_request_error() ::
    #{ 'code' => integer(),
       'messages' => list()
     }.

encode(#{ 'code' := Code,
          'messages' := Messages
        }) ->
    #{ 'code' => Code,
       'messages' => Messages
     }.
