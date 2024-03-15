-module(openapi_keyword_error).

-export([encode/1]).

-export_type([openapi_keyword_error/0]).

-type openapi_keyword_error() ::
    #{ 'data' => openapi_keyword:openapi_keyword(),
       'error_messages' => list()
     }.

encode(#{ 'data' := Data,
          'error_messages' := ErrorMessages
        }) ->
    #{ 'data' => Data,
       'error_messages' => ErrorMessages
     }.
