-module(openapi_disclosure_type).

-include("openapi.hrl").

-export([openapi_disclosure_type/0]).

-export_type([openapi_disclosure_type/0]).

-type openapi_disclosure_type() ::
  binary().

openapi_disclosure_type() ->
  elements([<<"NO_DISCLOSURE">>, <<"PRESCRIBING_INFORMATION">>, <<"PRESCRIBING_INFORMATION_BOX_WARNING">>, <<"IMPORTANT_SAFETY_INFO">>, <<"MED_GUIDE">>, <<"PATIENT_INFORMATION">>, <<"">>]).

