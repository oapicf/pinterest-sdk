-module(openapi_creative_assets_visibility_type).

-include("openapi.hrl").

-export([openapi_creative_assets_visibility_type/0]).

-export_type([openapi_creative_assets_visibility_type/0]).

-type openapi_creative_assets_visibility_type() ::
  binary().

openapi_creative_assets_visibility_type() ->
  elements([<<"VISIBLE">>, <<"HIDDEN">>]).

