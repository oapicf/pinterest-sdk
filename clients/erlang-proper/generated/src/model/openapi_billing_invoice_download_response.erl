-module(openapi_billing_invoice_download_response).

-include("openapi.hrl").

-export([openapi_billing_invoice_download_response/0]).

-export([openapi_billing_invoice_download_response/1]).

-export_type([openapi_billing_invoice_download_response/0]).

-type openapi_billing_invoice_download_response() ::
  [ {'download_url', binary() }
  | {'id', binary() }
  ].


openapi_billing_invoice_download_response() ->
    openapi_billing_invoice_download_response([]).

openapi_billing_invoice_download_response(Fields) ->
  Default = [ {'download_url', binary() }
            , {'id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

