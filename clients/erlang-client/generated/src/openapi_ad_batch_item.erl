-module(openapi_ad_batch_item).

-export([encode/1]).

-export_type([openapi_ad_batch_item/0]).

-type openapi_ad_batch_item() ::
    #{ 'data' => openapi_ad:openapi_ad(),
       'exceptions' => openapi_pinterest_lib_error:openapi_pinterest_lib_error()
     }.

encode(#{ 'data' := Data,
          'exceptions' := Exceptions
        }) ->
    #{ 'data' => Data,
       'exceptions' => Exceptions
     }.
