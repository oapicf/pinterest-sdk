-module(openapi_ad_array_response_element).

-export([encode/1]).

-export_type([openapi_ad_array_response_element/0]).

-type openapi_ad_array_response_element() ::
    #{ 'data' => openapi_ad_response:openapi_ad_response(),
       'exceptions' => openapi_exception:openapi_exception()
     }.

encode(#{ 'data' := Data,
          'exceptions' := Exceptions
        }) ->
    #{ 'data' => Data,
       'exceptions' => Exceptions
     }.
