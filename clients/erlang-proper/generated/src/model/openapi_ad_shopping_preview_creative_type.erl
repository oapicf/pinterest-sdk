-module(openapi_ad_shopping_preview_creative_type).

-include("openapi.hrl").

-export([openapi_ad_shopping_preview_creative_type/0]).

-export_type([openapi_ad_shopping_preview_creative_type/0]).

-type openapi_ad_shopping_preview_creative_type() ::
  binary().

openapi_ad_shopping_preview_creative_type() ->
  elements([<<"SHOPPING">>, <<"COLLECTION">>, <<"CAROUSEL">>, <<"MAX_WIDTH_COLLECTION">>]).

