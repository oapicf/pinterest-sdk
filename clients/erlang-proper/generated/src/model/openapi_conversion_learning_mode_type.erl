-module(openapi_conversion_learning_mode_type).

-include("openapi.hrl").

-export([openapi_conversion_learning_mode_type/0]).

-export_type([openapi_conversion_learning_mode_type/0]).

-type openapi_conversion_learning_mode_type() ::
  binary().

openapi_conversion_learning_mode_type() ->
  elements([<<"NOT_ACTIVE">>, <<"ACTIVE">>, <<"">>]).

