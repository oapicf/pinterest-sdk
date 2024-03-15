-module(openapi_pin_media_source_image_url).

-include("openapi.hrl").

-export([openapi_pin_media_source_image_url/0]).

-export([openapi_pin_media_source_image_url/1]).

-export_type([openapi_pin_media_source_image_url/0]).

-type openapi_pin_media_source_image_url() ::
  [ {'source_type', binary() }
  | {'url', binary() }
  | {'is_standard', boolean() }
  ].


openapi_pin_media_source_image_url() ->
    openapi_pin_media_source_image_url([]).

openapi_pin_media_source_image_url(Fields) ->
  Default = [ {'source_type', elements([<<"image_url">>]) }
            , {'url', binary() }
            , {'is_standard', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

