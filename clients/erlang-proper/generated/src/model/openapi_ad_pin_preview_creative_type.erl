-module(openapi_ad_pin_preview_creative_type).

-include("openapi.hrl").

-export([openapi_ad_pin_preview_creative_type/0]).

-export_type([openapi_ad_pin_preview_creative_type/0]).

-type openapi_ad_pin_preview_creative_type() ::
  binary().

openapi_ad_pin_preview_creative_type() ->
  elements([<<"SHOPPING">>, <<"COLLECTION">>, <<"MAX_VIDEO">>, <<"MAX_WIDTH_VIDEO_COLLECTION">>, <<"MAX_WIDTH_REGULAR_COLLECTION">>]).

