-module(openapi_intended_promotion_type).

-include("openapi.hrl").

-export([openapi_intended_promotion_type/0]).

-export_type([openapi_intended_promotion_type/0]).

-type openapi_intended_promotion_type() ::
  binary().

openapi_intended_promotion_type() ->
  elements([<<"LEGACY">>, <<"STANDARD_AD">>, <<"CATALOG">>]).

