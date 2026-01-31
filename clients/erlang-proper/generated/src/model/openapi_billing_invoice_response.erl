-module(openapi_billing_invoice_response).

-include("openapi.hrl").

-export([openapi_billing_invoice_response/0]).

-export([openapi_billing_invoice_response/1]).

-export_type([openapi_billing_invoice_response/0]).

-type openapi_billing_invoice_response() ::
  [ {'ad_account_id', binary() }
  | {'ad_account_name', binary() }
  | {'amount_billed_micro_currency', integer() }
  | {'amount_discount_micro_currency', integer() }
  | {'amount_net_micro_currency', integer() }
  | {'amount_tax_micro_currency', integer() }
  | {'bill_to_country', binary() }
  | {'billing_period_end_date', date() }
  | {'billing_period_start_date', date() }
  | {'currency', openapi_currency:openapi_currency() }
  | {'document_type', binary() }
  | {'id', binary() }
  | {'invoice_due_date', date() }
  | {'payment_terms', binary() }
  | {'status', binary() }
  ].


openapi_billing_invoice_response() ->
    openapi_billing_invoice_response([]).

openapi_billing_invoice_response(Fields) ->
  Default = [ {'ad_account_id', binary() }
            , {'ad_account_name', binary() }
            , {'amount_billed_micro_currency', integer() }
            , {'amount_discount_micro_currency', integer() }
            , {'amount_net_micro_currency', integer() }
            , {'amount_tax_micro_currency', integer() }
            , {'bill_to_country', binary() }
            , {'billing_period_end_date', date() }
            , {'billing_period_start_date', date() }
            , {'currency', openapi_currency:openapi_currency() }
            , {'document_type', elements([<<"INVOICE">>, <<"CREDIT_MEMO">>]) }
            , {'id', binary() }
            , {'invoice_due_date', date() }
            , {'payment_terms', binary() }
            , {'status', elements([<<"OPEN">>, <<"CLOSED">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

