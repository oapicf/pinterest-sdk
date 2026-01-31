-module(openapi_billing_invoice_download_response).

-export([encode/1]).

-export_type([openapi_billing_invoice_download_response/0]).

-type openapi_billing_invoice_download_response() ::
    #{ 'download_url' => binary(),
       'id' => binary()
     }.

encode(#{ 'download_url' := DownloadUrl,
          'id' := Id
        }) ->
    #{ 'download_url' => DownloadUrl,
       'id' => Id
     }.
