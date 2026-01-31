-module(openapi_pin_media_metadata).

-include("openapi.hrl").

-export([openapi_pin_media_metadata/0]).

-export([openapi_pin_media_metadata/1]).

-export_type([openapi_pin_media_metadata/0]).

-type openapi_pin_media_metadata() ::
  [ {'description', binary() }
  | {'images', openapi_image_size:openapi_image_size() }
  | {'item_type', binary() }
  | {'link', binary() }
  | {'title', binary() }
  | {'cover_image_url', binary() }
  | {'duration', integer() }
  | {'height', integer() }
  | {'video_url', binary() }
  | {'width', integer() }
  ].


openapi_pin_media_metadata() ->
    openapi_pin_media_metadata([]).

openapi_pin_media_metadata(Fields) ->
  Default = [ {'description', binary() }
            , {'images', openapi_image_size:openapi_image_size() }
            , {'item_type', binary() }
            , {'link', binary() }
            , {'title', binary() }
            , {'cover_image_url', binary() }
            , {'duration', integer() }
            , {'height', integer() }
            , {'video_url', binary() }
            , {'width', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

