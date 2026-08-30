-module(openapi_image_metadata).

-export([encode/1]).

-export_type([openapi_image_metadata/0]).

-type openapi_image_metadata() ::
    #{ 'description' => binary(),
       'images' => openapi_image_size:openapi_image_size(),
       'item_type' := binary(),
       'link' => binary(),
       'title' => binary()
     }.

encode(#{ 'description' := Description,
          'images' := Images,
          'item_type' := ItemType,
          'link' := Link,
          'title' := Title
        }) ->
    #{ 'description' => Description,
       'images' => Images,
       'item_type' => ItemType,
       'link' => Link,
       'title' => Title
     }.
