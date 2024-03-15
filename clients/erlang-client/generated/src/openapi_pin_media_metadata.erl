-module(openapi_pin_media_metadata).

-export([encode/1]).

-export_type([openapi_pin_media_metadata/0]).

-type openapi_pin_media_metadata() ::
    #{ 'item_type' => binary(),
       'title' => binary(),
       'description' => binary(),
       'link' => binary(),
       'images' => openapi_image_metadata_images:openapi_image_metadata_images(),
       'cover_image_url' => binary(),
       'video_url' => binary(),
       'duration' => integer(),
       'height' => integer(),
       'width' => integer()
     }.

encode(#{ 'item_type' := ItemType,
          'title' := Title,
          'description' := Description,
          'link' := Link,
          'images' := Images,
          'cover_image_url' := CoverImageUrl,
          'video_url' := VideoUrl,
          'duration' := Duration,
          'height' := Height,
          'width' := Width
        }) ->
    #{ 'item_type' => ItemType,
       'title' => Title,
       'description' => Description,
       'link' => Link,
       'images' => Images,
       'cover_image_url' => CoverImageUrl,
       'video_url' => VideoUrl,
       'duration' => Duration,
       'height' => Height,
       'width' => Width
     }.
