-module(openapi_appsflyer_audience).

-export([encode/1]).

-export_type([openapi_appsflyer_audience/0]).

-type openapi_appsflyer_audience() ::
    #{ 'container_id' := binary(),
       'name' := binary(),
       'platform' := openapi_appsflyer_platform:openapi_appsflyer_platform()
     }.

encode(#{ 'container_id' := ContainerId,
          'name' := Name,
          'platform' := Platform
        }) ->
    #{ 'container_id' => ContainerId,
       'name' => Name,
       'platform' => Platform
     }.
