-module(openapi_image_metadata).

-export([encode/1]).

-export_type([openapi_image_metadata/0]).

-type openapi_image_metadata() ::
    #{ 'item_type' => binary(),
       'title' => binary(),
       'description' => binary(),
       'link' => binary(),
       'images' => openapi_image_metadata_images:openapi_image_metadata_images()
     }.

encode(#{ 'item_type' := ItemType,
          'title' := Title,
          'description' := Description,
          'link' := Link,
          'images' := Images
        }) ->
    #{ 'item_type' => ItemType,
       'title' => Title,
       'description' => Description,
       'link' => Link,
       'images' => Images
     }.
