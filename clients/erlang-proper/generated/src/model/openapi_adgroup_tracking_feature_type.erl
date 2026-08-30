-module(openapi_adgroup_tracking_feature_type).

-include("openapi.hrl").

-export([openapi_adgroup_tracking_feature_type/0]).

-export_type([openapi_adgroup_tracking_feature_type/0]).

-type openapi_adgroup_tracking_feature_type() ::
  binary().

openapi_adgroup_tracking_feature_type() ->
  elements([<<"TRENDS">>, <<"CLONE_META">>, <<"BULK_EDITOR">>, <<"AD_ROTATION">>]).

