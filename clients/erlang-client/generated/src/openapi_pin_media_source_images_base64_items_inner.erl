-module(openapi_pin_media_source_images_base64_items_inner).

-export([encode/1]).

-export_type([openapi_pin_media_source_images_base64_items_inner/0]).

-type openapi_pin_media_source_images_base64_items_inner() ::
    #{ 'title' => binary(),
       'description' => binary(),
       'link' => binary(),
       'content_type' := binary(),
       'data' := binary()
     }.

encode(#{ 'title' := Title,
          'description' := Description,
          'link' := Link,
          'content_type' := ContentType,
          'data' := Data
        }) ->
    #{ 'title' => Title,
       'description' => Description,
       'link' => Link,
       'content_type' => ContentType,
       'data' => Data
     }.
