-module(openapi_linked_business).

-export([encode/1]).

-export_type([openapi_linked_business/0]).

-type openapi_linked_business() ::
    #{ 'username' => binary(),
       'image_small_url' => binary(),
       'image_medium_url' => binary(),
       'image_large_url' => binary(),
       'image_xlarge_url' => binary()
     }.

encode(#{ 'username' := Username,
          'image_small_url' := ImageSmallUrl,
          'image_medium_url' := ImageMediumUrl,
          'image_large_url' := ImageLargeUrl,
          'image_xlarge_url' := ImageXlargeUrl
        }) ->
    #{ 'username' => Username,
       'image_small_url' => ImageSmallUrl,
       'image_medium_url' => ImageMediumUrl,
       'image_large_url' => ImageLargeUrl,
       'image_xlarge_url' => ImageXlargeUrl
     }.
