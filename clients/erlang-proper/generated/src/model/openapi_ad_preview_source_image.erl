-module(openapi_ad_preview_source_image).

-include("openapi.hrl").

-export([openapi_ad_preview_source_image/0]).

-export([openapi_ad_preview_source_image/1]).

-export_type([openapi_ad_preview_source_image/0]).

-type openapi_ad_preview_source_image() ::
  [ {'image_url', binary() }
  | {'promotion_id', binary() }
  | {'title', binary() }
  ].


openapi_ad_preview_source_image() ->
    openapi_ad_preview_source_image([]).

openapi_ad_preview_source_image(Fields) ->
  Default = [ {'image_url', binary() }
            , {'promotion_id', binary() }
            , {'title', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

