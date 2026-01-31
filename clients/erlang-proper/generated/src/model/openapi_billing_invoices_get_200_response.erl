-module(openapi_billing_invoices_get_200_response).

-include("openapi.hrl").

-export([openapi_billing_invoices_get_200_response/0]).

-export([openapi_billing_invoices_get_200_response/1]).

-export_type([openapi_billing_invoices_get_200_response/0]).

-type openapi_billing_invoices_get_200_response() ::
  [ {'bookmark', binary() }
  | {'items', list(openapi_billing_invoice_response:openapi_billing_invoice_response()) }
  ].


openapi_billing_invoices_get_200_response() ->
    openapi_billing_invoices_get_200_response([]).

openapi_billing_invoices_get_200_response(Fields) ->
  Default = [ {'bookmark', binary() }
            , {'items', list(openapi_billing_invoice_response:openapi_billing_invoice_response()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

