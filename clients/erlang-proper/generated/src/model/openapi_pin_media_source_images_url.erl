-module(openapi_pin_media_source_images_url).

-include("openapi.hrl").

-export([openapi_pin_media_source_images_url/0]).

-export([openapi_pin_media_source_images_url/1]).

-export_type([openapi_pin_media_source_images_url/0]).

-type openapi_pin_media_source_images_url() ::
  [ {'index', integer() }
  | {'items', list(openapi_pin_media_source_images_url_item:openapi_pin_media_source_images_url_item()) }
  | {'source_type', binary() }
  ].


openapi_pin_media_source_images_url() ->
    openapi_pin_media_source_images_url([]).

openapi_pin_media_source_images_url(Fields) ->
  Default = [ {'index', integer(0) }
            , {'items', list(openapi_pin_media_source_images_url_item:openapi_pin_media_source_images_url_item(), 2, 5) }
            , {'source_type', elements([<<"multiple_image_urls">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

