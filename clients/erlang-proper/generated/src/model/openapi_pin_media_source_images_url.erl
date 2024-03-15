-module(openapi_pin_media_source_images_url).

-include("openapi.hrl").

-export([openapi_pin_media_source_images_url/0]).

-export([openapi_pin_media_source_images_url/1]).

-export_type([openapi_pin_media_source_images_url/0]).

-type openapi_pin_media_source_images_url() ::
  [ {'source_type', binary() }
  | {'items', list(openapi_pin_media_source_images_url_items_inner:openapi_pin_media_source_images_url_items_inner()) }
  | {'index', integer() }
  ].


openapi_pin_media_source_images_url() ->
    openapi_pin_media_source_images_url([]).

openapi_pin_media_source_images_url(Fields) ->
  Default = [ {'source_type', elements([<<"multiple_image_urls">>]) }
            , {'items', list(openapi_pin_media_source_images_url_items_inner:openapi_pin_media_source_images_url_items_inner(), 2, 5) }
            , {'index', integer(0) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

