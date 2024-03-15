-module(openapi_pin_media_source_images_url_items_inner).

-include("openapi.hrl").

-export([openapi_pin_media_source_images_url_items_inner/0]).

-export([openapi_pin_media_source_images_url_items_inner/1]).

-export_type([openapi_pin_media_source_images_url_items_inner/0]).

-type openapi_pin_media_source_images_url_items_inner() ::
  [ {'title', binary() }
  | {'description', binary() }
  | {'link', binary() }
  | {'url', binary() }
  ].


openapi_pin_media_source_images_url_items_inner() ->
    openapi_pin_media_source_images_url_items_inner([]).

openapi_pin_media_source_images_url_items_inner(Fields) ->
  Default = [ {'title', binary() }
            , {'description', binary() }
            , {'link', binary() }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

