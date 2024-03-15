-module(openapi_pin_media_metadata).

-include("openapi.hrl").

-export([openapi_pin_media_metadata/0]).

-export([openapi_pin_media_metadata/1]).

-export_type([openapi_pin_media_metadata/0]).

-type openapi_pin_media_metadata() ::
  [ {'item_type', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'link', binary() }
  | {'images', openapi_image_metadata_images:openapi_image_metadata_images() }
  | {'cover_image_url', binary() }
  | {'video_url', binary() }
  | {'duration', integer() }
  | {'height', integer() }
  | {'width', integer() }
  ].


openapi_pin_media_metadata() ->
    openapi_pin_media_metadata([]).

openapi_pin_media_metadata(Fields) ->
  Default = [ {'item_type', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'link', binary() }
            , {'images', openapi_image_metadata_images:openapi_image_metadata_images() }
            , {'cover_image_url', binary() }
            , {'video_url', binary() }
            , {'duration', integer() }
            , {'height', integer() }
            , {'width', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

