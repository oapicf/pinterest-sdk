-module(openapi_image_metadata).

-include("openapi.hrl").

-export([openapi_image_metadata/0]).

-export([openapi_image_metadata/1]).

-export_type([openapi_image_metadata/0]).

-type openapi_image_metadata() ::
  [ {'item_type', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'link', binary() }
  | {'images', openapi_image_metadata_images:openapi_image_metadata_images() }
  ].


openapi_image_metadata() ->
    openapi_image_metadata([]).

openapi_image_metadata(Fields) ->
  Default = [ {'item_type', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'link', binary() }
            , {'images', openapi_image_metadata_images:openapi_image_metadata_images() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

