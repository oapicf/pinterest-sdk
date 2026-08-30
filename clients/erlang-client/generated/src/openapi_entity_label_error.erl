-module(openapi_entity_label_error).

-export([encode/1]).

-export_type([openapi_entity_label_error/0]).

-type openapi_entity_label_error() ::
    #{ 'data' => openapi_entity_label:openapi_entity_label(),
       'error_messages' => list()
     }.

encode(#{ 'data' := Data,
          'error_messages' := ErrorMessages
        }) ->
    #{ 'data' => Data,
       'error_messages' => ErrorMessages
     }.
