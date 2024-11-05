-module(openapi_targeting_spec_app_type).

-include("openapi.hrl").

-export([openapi_targeting_spec_app_type/0]).

-export_type([openapi_targeting_spec_app_type/0]).

-type openapi_targeting_spec_app_type() ::
  binary().

openapi_targeting_spec_app_type() ->
  elements([<<"android_mobile">>, <<"android_tablet">>, <<"ipad">>, <<"iphone">>, <<"web">>, <<"web_mobile">>]).

