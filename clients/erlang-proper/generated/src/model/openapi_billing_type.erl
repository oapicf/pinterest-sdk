-module(openapi_billing_type).

-include("openapi.hrl").

-export([openapi_billing_type/0]).

-export_type([openapi_billing_type/0]).

-type openapi_billing_type() ::
  binary().

openapi_billing_type() ->
  elements([<<"CREDIT_CARD">>, <<"INVOICE">>, <<"INTERNAL">>, <<"RECURRING">>, <<"PREPAID">>]).

