-module(openapi_ad_preview_create_from_image).

-export([encode/1]).

-export_type([openapi_ad_preview_create_from_image/0]).

-type openapi_ad_preview_create_from_image() ::
    #{ 'image_url' := binary(),
       'title' := binary()
     }.

encode(#{ 'image_url' := ImageUrl,
          'title' := Title
        }) ->
    #{ 'image_url' => ImageUrl,
       'title' => Title
     }.
