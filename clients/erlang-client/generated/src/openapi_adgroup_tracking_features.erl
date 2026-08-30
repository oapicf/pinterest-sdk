-module(openapi_adgroup_tracking_features).

-export([encode/1]).

-export_type([openapi_adgroup_tracking_features/0]).

-type openapi_adgroup_tracking_features() ::
    #{ 'enabled' => list()
     }.

encode(#{ 'enabled' := Enabled
        }) ->
    #{ 'enabled' => Enabled
     }.
