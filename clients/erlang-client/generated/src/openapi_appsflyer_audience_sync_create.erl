-module(openapi_appsflyer_audience_sync_create).

-export([encode/1]).

-export_type([openapi_appsflyer_audience_sync_create/0]).

-type openapi_appsflyer_audience_sync_create() ::
    #{ 'container_id' := binary(),
       'url_adid_sha256' => binary(),
       'url_email_sha256' => binary()
     }.

encode(#{ 'container_id' := ContainerId,
          'url_adid_sha256' := UrlAdidSha256,
          'url_email_sha256' := UrlEmailSha256
        }) ->
    #{ 'container_id' => ContainerId,
       'url_adid_sha256' => UrlAdidSha256,
       'url_email_sha256' => UrlEmailSha256
     }.
