-module(openapi_ad_preview_url_response).

-export([encode/1]).

-export_type([openapi_ad_preview_url_response/0]).

-type openapi_ad_preview_url_response() ::
    #{ 'url' => binary()
     }.

encode(#{ 'url' := Url
        }) ->
    #{ 'url' => Url
     }.
