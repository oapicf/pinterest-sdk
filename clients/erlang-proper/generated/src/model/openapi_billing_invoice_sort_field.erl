-module(openapi_billing_invoice_sort_field).

-include("openapi.hrl").

-export([openapi_billing_invoice_sort_field/0]).

-export_type([openapi_billing_invoice_sort_field/0]).

-type openapi_billing_invoice_sort_field() ::
  binary().

openapi_billing_invoice_sort_field() ->
  elements([<<"DUE_DATE">>, <<"BILLING_PERIOD">>, <<"DOCUMENT_TYPE">>, <<"TOTAL_AMOUNT">>, <<"INVOICE_NUMBER">>]).

