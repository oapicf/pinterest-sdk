-module(openapi_enhanced_match_status_type).

-include("openapi.hrl").

-export([openapi_enhanced_match_status_type/0]).

-export_type([openapi_enhanced_match_status_type/0]).

-type openapi_enhanced_match_status_type() ::
  binary().

openapi_enhanced_match_status_type() ->
  elements([<<"UNKNOWN">>, <<"NOT_VALIDATED">>, <<"VALIDATING_IN_PROGRESS">>, <<"VALIDATION_COMPLETE">>, <<"">>]).

