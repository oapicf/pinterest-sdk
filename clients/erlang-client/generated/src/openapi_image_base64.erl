-module(openapi_image_base64).

-export([encode/1]).

-export_type([openapi_image_base64/0]).

-type openapi_image_base64() ::
    #{ 'content_type' := binary(),
       'data' := binary()
     }.

encode(#{ 'content_type' := ContentType,
          'data' := Data
        }) ->
    #{ 'content_type' => ContentType,
       'data' => Data
     }.
