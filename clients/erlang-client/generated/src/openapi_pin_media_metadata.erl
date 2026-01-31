-module(openapi_pin_media_metadata).

-export([encode/1]).

-export_type([openapi_pin_media_metadata/0]).

-type openapi_pin_media_metadata() ::
    #{ 'description' => binary(),
       'images' => openapi_image_size:openapi_image_size(),
       'item_type' => binary(),
       'link' => binary(),
       'title' => binary(),
       'cover_image_url' => binary(),
       'duration' => integer(),
       'height' => integer(),
       'video_url' => binary(),
       'width' => integer()
     }.

encode(#{ 'description' := Description,
          'images' := Images,
          'item_type' := ItemType,
          'link' := Link,
          'title' := Title,
          'cover_image_url' := CoverImageUrl,
          'duration' := Duration,
          'height' := Height,
          'video_url' := VideoUrl,
          'width' := Width
        }) ->
    #{ 'description' => Description,
       'images' => Images,
       'item_type' => ItemType,
       'link' => Link,
       'title' => Title,
       'cover_image_url' => CoverImageUrl,
       'duration' => Duration,
       'height' => Height,
       'video_url' => VideoUrl,
       'width' => Width
     }.
