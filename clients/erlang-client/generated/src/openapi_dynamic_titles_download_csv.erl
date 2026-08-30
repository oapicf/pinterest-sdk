-module(openapi_dynamic_titles_download_csv).

-export([encode/1]).

-export_type([openapi_dynamic_titles_download_csv/0]).

-type openapi_dynamic_titles_download_csv() ::
    #{ 'download_url' => binary()
     }.

encode(#{ 'download_url' := DownloadUrl
        }) ->
    #{ 'download_url' => DownloadUrl
     }.
