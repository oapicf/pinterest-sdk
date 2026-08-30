-module(openapi_billing_invoice_status).

-include("openapi.hrl").

-export([openapi_billing_invoice_status/0]).

-export_type([openapi_billing_invoice_status/0]).

-type openapi_billing_invoice_status() ::
  binary().

openapi_billing_invoice_status() ->
  elements([<<"OPEN">>, <<"CLOSED">>]).

