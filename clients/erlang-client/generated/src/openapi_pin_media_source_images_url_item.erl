-module(openapi_pin_media_source_images_url_item).

-export([encode/1]).

-export_type([openapi_pin_media_source_images_url_item/0]).

-type openapi_pin_media_source_images_url_item() ::
    #{ 'description' => binary(),
       'link' => binary(),
       'title' => binary(),
       'url' := binary()
     }.

encode(#{ 'description' := Description,
          'link' := Link,
          'title' := Title,
          'url' := Url
        }) ->
    #{ 'description' => Description,
       'link' => Link,
       'title' => Title,
       'url' => Url
     }.
