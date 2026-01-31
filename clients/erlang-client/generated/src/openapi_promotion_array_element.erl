-module(openapi_promotion_array_element).

-export([encode/1]).

-export_type([openapi_promotion_array_element/0]).

-type openapi_promotion_array_element() ::
    #{ 'data' => openapi_promotion_response:openapi_promotion_response(),
       'exception' => openapi_exception:openapi_exception()
     }.

encode(#{ 'data' := Data,
          'exception' := Exception
        }) ->
    #{ 'data' => Data,
       'exception' => Exception
     }.
