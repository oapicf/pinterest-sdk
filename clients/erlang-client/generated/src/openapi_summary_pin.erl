-module(openapi_summary_pin).

-export([encode/1]).

-export_type([openapi_summary_pin/0]).

-type openapi_summary_pin() ::
    #{ 'alt_text' => binary(),
       'description' => binary(),
       'id' := binary(),
       'link' => binary(),
       'media' => openapi_pin_media:openapi_pin_media(),
       'title' => binary()
     }.

encode(#{ 'alt_text' := AltText,
          'description' := Description,
          'id' := Id,
          'link' := Link,
          'media' := Media,
          'title' := Title
        }) ->
    #{ 'alt_text' => AltText,
       'description' => Description,
       'id' => Id,
       'link' => Link,
       'media' => Media,
       'title' => Title
     }.
