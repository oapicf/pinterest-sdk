-module(openapi_image_details).

-export([encode/1]).

-export_type([openapi_image_details/0]).

-type openapi_image_details() ::
    #{ 'width' := integer(),
       'height' := integer(),
       'url' := binary()
     }.

encode(#{ 'width' := Width,
          'height' := Height,
          'url' := Url
        }) ->
    #{ 'width' => Width,
       'height' => Height,
       'url' => Url
     }.
