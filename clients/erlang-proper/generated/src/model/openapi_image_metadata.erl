-module(openapi_image_metadata).

-include("openapi.hrl").

-export([openapi_image_metadata/0]).

-export([openapi_image_metadata/1]).

-export_type([openapi_image_metadata/0]).

-type openapi_image_metadata() ::
  [ {'description', binary() }
  | {'images', openapi_image_size:openapi_image_size() }
  | {'item_type', binary() }
  | {'link', binary() }
  | {'title', binary() }
  ].


openapi_image_metadata() ->
    openapi_image_metadata([]).

openapi_image_metadata(Fields) ->
  Default = [ {'description', binary() }
            , {'images', openapi_image_size:openapi_image_size() }
            , {'item_type', elements([<<"image">>]) }
            , {'link', binary() }
            , {'title', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

