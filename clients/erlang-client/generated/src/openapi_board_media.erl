-module(openapi_board_media).

-export([encode/1]).

-export_type([openapi_board_media/0]).

-type openapi_board_media() ::
    #{ 'image_cover_url' => binary(),
       'pin_thumbnail_urls' => list()
     }.

encode(#{ 'image_cover_url' := ImageCoverUrl,
          'pin_thumbnail_urls' := PinThumbnailUrls
        }) ->
    #{ 'image_cover_url' => ImageCoverUrl,
       'pin_thumbnail_urls' => PinThumbnailUrls
     }.
