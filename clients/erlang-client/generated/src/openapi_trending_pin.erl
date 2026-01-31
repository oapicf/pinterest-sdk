-module(openapi_trending_pin).

-export([encode/1]).

-export_type([openapi_trending_pin/0]).

-type openapi_trending_pin() ::
    #{ 'height' := integer(),
       'id' := binary(),
       'src' := binary(),
       'width' := integer()
     }.

encode(#{ 'height' := Height,
          'id' := Id,
          'src' := Src,
          'width' := Width
        }) ->
    #{ 'height' => Height,
       'id' => Id,
       'src' => Src,
       'width' => Width
     }.
