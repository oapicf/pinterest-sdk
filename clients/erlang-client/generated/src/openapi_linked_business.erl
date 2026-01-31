-module(openapi_linked_business).

-export([encode/1]).

-export_type([openapi_linked_business/0]).

-type openapi_linked_business() ::
    #{ 'image_large_url' => binary(),
       'image_medium_url' => binary(),
       'image_small_url' => binary(),
       'image_xlarge_url' => binary(),
       'username' => binary()
     }.

encode(#{ 'image_large_url' := ImageLargeUrl,
          'image_medium_url' := ImageMediumUrl,
          'image_small_url' := ImageSmallUrl,
          'image_xlarge_url' := ImageXlargeUrl,
          'username' := Username
        }) ->
    #{ 'image_large_url' => ImageLargeUrl,
       'image_medium_url' => ImageMediumUrl,
       'image_small_url' => ImageSmallUrl,
       'image_xlarge_url' => ImageXlargeUrl,
       'username' => Username
     }.
