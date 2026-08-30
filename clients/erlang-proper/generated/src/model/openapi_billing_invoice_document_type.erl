-module(openapi_billing_invoice_document_type).

-include("openapi.hrl").

-export([openapi_billing_invoice_document_type/0]).

-export_type([openapi_billing_invoice_document_type/0]).

-type openapi_billing_invoice_document_type() ::
  binary().

openapi_billing_invoice_document_type() ->
  elements([<<"INVOICE">>, <<"CREDIT_MEMO">>]).

