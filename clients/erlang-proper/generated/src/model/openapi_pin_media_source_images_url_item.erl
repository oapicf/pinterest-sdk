-module(openapi_pin_media_source_images_url_item).

-include("openapi.hrl").

-export([openapi_pin_media_source_images_url_item/0]).

-export([openapi_pin_media_source_images_url_item/1]).

-export_type([openapi_pin_media_source_images_url_item/0]).

-type openapi_pin_media_source_images_url_item() ::
  [ {'description', binary() }
  | {'link', binary() }
  | {'title', binary() }
  | {'url', binary() }
  ].


openapi_pin_media_source_images_url_item() ->
    openapi_pin_media_source_images_url_item([]).

openapi_pin_media_source_images_url_item(Fields) ->
  Default = [ {'description', binary() }
            , {'link', binary() }
            , {'title', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

