-module(openapi_trending_pin).

-export([encode/1]).

-export_type([openapi_trending_pin/0]).

-type openapi_trending_pin() ::
    #{ 'color' := binary(),
       'height' := integer(),
       'id' := binary(),
       'src' := binary(),
       'vertical_offset' => float(),
       'width' := integer()
     }.

encode(#{ 'color' := Color,
          'height' := Height,
          'id' := Id,
          'src' := Src,
          'vertical_offset' := VerticalOffset,
          'width' := Width
        }) ->
    #{ 'color' => Color,
       'height' => Height,
       'id' => Id,
       'src' => Src,
       'vertical_offset' => VerticalOffset,
       'width' => Width
     }.
