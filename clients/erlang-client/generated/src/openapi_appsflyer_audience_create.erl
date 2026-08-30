-module(openapi_appsflyer_audience_create).

-export([encode/1]).

-export_type([openapi_appsflyer_audience_create/0]).

-type openapi_appsflyer_audience_create() ::
    #{ 'name' := binary(),
       'platform' := openapi_appsflyer_platform:openapi_appsflyer_platform()
     }.

encode(#{ 'name' := Name,
          'platform' := Platform
        }) ->
    #{ 'name' => Name,
       'platform' => Platform
     }.
