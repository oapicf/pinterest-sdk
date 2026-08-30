-module(openapi_adgroup_tracking_features).

-include("openapi.hrl").

-export([openapi_adgroup_tracking_features/0]).

-export([openapi_adgroup_tracking_features/1]).

-export_type([openapi_adgroup_tracking_features/0]).

-type openapi_adgroup_tracking_features() ::
  [ {'enabled', list(openapi_adgroup_tracking_feature_type:openapi_adgroup_tracking_feature_type()) }
  ].


openapi_adgroup_tracking_features() ->
    openapi_adgroup_tracking_features([]).

openapi_adgroup_tracking_features(Fields) ->
  Default = [ {'enabled', list(openapi_adgroup_tracking_feature_type:openapi_adgroup_tracking_feature_type()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

