-module(openapi_pin_media_source_image_base64).

-include("openapi.hrl").

-export([openapi_pin_media_source_image_base64/0]).

-export([openapi_pin_media_source_image_base64/1]).

-export_type([openapi_pin_media_source_image_base64/0]).

-type openapi_pin_media_source_image_base64() ::
  [ {'source_type', binary() }
  | {'content_type', binary() }
  | {'data', binary() }
  | {'is_standard', boolean() }
  ].


openapi_pin_media_source_image_base64() ->
    openapi_pin_media_source_image_base64([]).

openapi_pin_media_source_image_base64(Fields) ->
  Default = [ {'source_type', elements([<<"image_base64">>]) }
            , {'content_type', elements([<<"image/jpeg">>, <<"image/png">>]) }
            , {'data', binary() }
            , {'is_standard', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

