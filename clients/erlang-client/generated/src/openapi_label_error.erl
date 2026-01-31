-module(openapi_label_error).

-export([encode/1]).

-export_type([openapi_label_error/0]).

-type openapi_label_error() ::
    #{ 'data' => openapi_label:openapi_label(),
       'error_messages' => list()
     }.

encode(#{ 'data' := Data,
          'error_messages' := ErrorMessages
        }) ->
    #{ 'data' => Data,
       'error_messages' => ErrorMessages
     }.
