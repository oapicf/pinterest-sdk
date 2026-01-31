-module(openapi_pin_media_source_image_url).

-include("openapi.hrl").

-export([openapi_pin_media_source_image_url/0]).

-export([openapi_pin_media_source_image_url/1]).

-export_type([openapi_pin_media_source_image_url/0]).

-type openapi_pin_media_source_image_url() ::
  [ {'is_standard', boolean() }
  | {'source_type', binary() }
  | {'url', binary() }
  ].


openapi_pin_media_source_image_url() ->
    openapi_pin_media_source_image_url([]).

openapi_pin_media_source_image_url(Fields) ->
  Default = [ {'is_standard', boolean() }
            , {'source_type', elements([<<"image_url">>]) }
            , {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

