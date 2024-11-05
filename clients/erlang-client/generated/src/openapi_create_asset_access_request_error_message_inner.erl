-module(openapi_create_asset_access_request_error_message_inner).

-export([encode/1]).

-export_type([openapi_create_asset_access_request_error_message_inner/0]).

-type openapi_create_asset_access_request_error_message_inner() ::
    #{ 'code' => integer(),
       'messages' => list()
     }.

encode(#{ 'code' := Code,
          'messages' := Messages
        }) ->
    #{ 'code' => Code,
       'messages' => Messages
     }.
