-module(openapi_image_metadata_images).

-include("openapi.hrl").

-export([openapi_image_metadata_images/0]).

-export([openapi_image_metadata_images/1]).

-export_type([openapi_image_metadata_images/0]).

-type openapi_image_metadata_images() ::
  [ {'150x150', openapi_image_details:openapi_image_details() }
  | {'400x300', openapi_image_details:openapi_image_details() }
  | {'600x', openapi_image_details:openapi_image_details() }
  | {'1200x', openapi_image_details:openapi_image_details() }
  ].


openapi_image_metadata_images() ->
    openapi_image_metadata_images([]).

openapi_image_metadata_images(Fields) ->
  Default = [ {'150x150', openapi_image_details:openapi_image_details() }
            , {'400x300', openapi_image_details:openapi_image_details() }
            , {'600x', openapi_image_details:openapi_image_details() }
            , {'1200x', openapi_image_details:openapi_image_details() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

