-module(openapi_pin_media_source_image_base64).

-include("openapi.hrl").

-export([openapi_pin_media_source_image_base64/0]).

-export([openapi_pin_media_source_image_base64/1]).

-export_type([openapi_pin_media_source_image_base64/0]).

-type openapi_pin_media_source_image_base64() ::
  [ {'content_type', openapi_content_type:openapi_content_type() }
  | {'data', binary() }
  | {'is_standard', boolean() }
  | {'source_type', binary() }
  ].


openapi_pin_media_source_image_base64() ->
    openapi_pin_media_source_image_base64([]).

openapi_pin_media_source_image_base64(Fields) ->
  Default = [ {'content_type', openapi_content_type:openapi_content_type() }
            , {'data', binary() }
            , {'is_standard', boolean() }
            , {'source_type', elements([<<"image_base64">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

