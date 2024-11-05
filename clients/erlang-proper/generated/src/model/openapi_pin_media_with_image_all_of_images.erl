-module(openapi_pin_media_with_image_all_of_images).

-include("openapi.hrl").

-export([openapi_pin_media_with_image_all_of_images/0]).

-export([openapi_pin_media_with_image_all_of_images/1]).

-export_type([openapi_pin_media_with_image_all_of_images/0]).

-type openapi_pin_media_with_image_all_of_images() ::
  [ {'150x150', map() }
  | {'400x300', map() }
  | {'600x', map() }
  | {'1200x', map() }
  ].


openapi_pin_media_with_image_all_of_images() ->
    openapi_pin_media_with_image_all_of_images([]).

openapi_pin_media_with_image_all_of_images(Fields) ->
  Default = [ {'150x150', map() }
            , {'400x300', map() }
            , {'600x', map() }
            , {'1200x', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

