-module(openapi_app_type_multipliers).

-export([encode/1]).

-export_type([openapi_app_type_multipliers/0]).

-type openapi_app_type_multipliers() ::
    #{ 'APP_TYPE' => binary()
     }.

encode(#{ 'APP_TYPE' := APPTYPE
        }) ->
    #{ 'APP_TYPE' => APPTYPE
     }.
