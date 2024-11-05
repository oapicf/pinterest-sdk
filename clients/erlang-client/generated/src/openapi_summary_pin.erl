-module(openapi_summary_pin).

-export([encode/1]).

-export_type([openapi_summary_pin/0]).

-type openapi_summary_pin() ::
    #{ 'media' => openapi_pin_media:openapi_pin_media(),
       'alt_text' => binary(),
       'link' => binary(),
       'title' => binary(),
       'description' => binary()
     }.

encode(#{ 'media' := Media,
          'alt_text' := AltText,
          'link' := Link,
          'title' := Title,
          'description' := Description
        }) ->
    #{ 'media' => Media,
       'alt_text' => AltText,
       'link' => Link,
       'title' => Title,
       'description' => Description
     }.
