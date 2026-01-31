-module(openapi_pin_media_source_images_base64_item).

-export([encode/1]).

-export_type([openapi_pin_media_source_images_base64_item/0]).

-type openapi_pin_media_source_images_base64_item() ::
    #{ 'content_type' := openapi_content_type:openapi_content_type(),
       'data' := binary(),
       'description' => binary(),
       'link' => binary(),
       'title' => binary()
     }.

encode(#{ 'content_type' := ContentType,
          'data' := Data,
          'description' := Description,
          'link' := Link,
          'title' := Title
        }) ->
    #{ 'content_type' => ContentType,
       'data' => Data,
       'description' => Description,
       'link' => Link,
       'title' => Title
     }.
