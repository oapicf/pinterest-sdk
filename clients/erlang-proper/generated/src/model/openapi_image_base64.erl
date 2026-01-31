-module(openapi_image_base64).

-include("openapi.hrl").

-export([openapi_image_base64/0]).

-export([openapi_image_base64/1]).

-export_type([openapi_image_base64/0]).

-type openapi_image_base64() ::
  [ {'content_type', binary() }
  | {'data', binary() }
  ].


openapi_image_base64() ->
    openapi_image_base64([]).

openapi_image_base64(Fields) ->
  Default = [ {'content_type', elements([<<"image/jpeg">>, <<"image/png">>]) }
            , {'data', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

