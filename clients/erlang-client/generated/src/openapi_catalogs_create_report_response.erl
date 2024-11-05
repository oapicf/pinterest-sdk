-module(openapi_catalogs_create_report_response).

-export([encode/1]).

-export_type([openapi_catalogs_create_report_response/0]).

-type openapi_catalogs_create_report_response() ::
    #{ 'token' => binary()
     }.

encode(#{ 'token' := Token
        }) ->
    #{ 'token' => Token
     }.
