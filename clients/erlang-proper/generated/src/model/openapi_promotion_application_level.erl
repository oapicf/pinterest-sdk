-module(openapi_promotion_application_level).

-include("openapi.hrl").

-export([openapi_promotion_application_level/0]).

-export_type([openapi_promotion_application_level/0]).

-type openapi_promotion_application_level() ::
  binary().

openapi_promotion_application_level() ->
  elements([<<"NONE">>, <<"ITEM">>, <<"AD_GROUP">>, <<"">>]).

