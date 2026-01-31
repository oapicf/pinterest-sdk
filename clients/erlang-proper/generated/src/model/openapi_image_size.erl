-module(openapi_image_size).

-include("openapi.hrl").

-export([openapi_image_size/0]).

-export([openapi_image_size/1]).

-export_type([openapi_image_size/0]).

-type openapi_image_size() ::
  [ {'1200x', openapi_image_details:openapi_image_details() }
  | {'150x150', openapi_image_details:openapi_image_details() }
  | {'400x300', openapi_image_details:openapi_image_details() }
  | {'600x', openapi_image_details:openapi_image_details() }
  ].


openapi_image_size() ->
    openapi_image_size([]).

openapi_image_size(Fields) ->
  Default = [ {'1200x', openapi_image_details:openapi_image_details() }
            , {'150x150', openapi_image_details:openapi_image_details() }
            , {'400x300', openapi_image_details:openapi_image_details() }
            , {'600x', openapi_image_details:openapi_image_details() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

