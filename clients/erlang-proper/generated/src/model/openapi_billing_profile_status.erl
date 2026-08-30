-module(openapi_billing_profile_status).

-include("openapi.hrl").

-export([openapi_billing_profile_status/0]).

-export_type([openapi_billing_profile_status/0]).

-type openapi_billing_profile_status() ::
  binary().

openapi_billing_profile_status() ->
  elements([<<"UNSPECIFIED">>, <<"VALID">>, <<"INVALID">>, <<"PENDING">>, <<"DELETED">>, <<"SECONDARY">>, <<"PENDING_SECONDARY">>]).

