-module(openapi_pin_media_source_images_url_items_inner).

-export([encode/1]).

-export_type([openapi_pin_media_source_images_url_items_inner/0]).

-type openapi_pin_media_source_images_url_items_inner() ::
    #{ 'title' => binary(),
       'description' => binary(),
       'link' => binary(),
       'url' := binary()
     }.

encode(#{ 'title' := Title,
          'description' := Description,
          'link' := Link,
          'url' := Url
        }) ->
    #{ 'title' => Title,
       'description' => Description,
       'link' => Link,
       'url' => Url
     }.
