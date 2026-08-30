-module(openapi_attribution_model).

-include("openapi.hrl").

-export([openapi_attribution_model/0]).

-export_type([openapi_attribution_model/0]).

-type openapi_attribution_model() ::
  binary().

openapi_attribution_model() ->
  elements([<<"first_touch">>, <<"last_touch">>, <<"multi_touch">>, <<"mmm">>]).

