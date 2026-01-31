-module(openapi_label_parent_type).

-include("openapi.hrl").

-export([openapi_label_parent_type/0]).

-export_type([openapi_label_parent_type/0]).

-type openapi_label_parent_type() ::
  binary().

openapi_label_parent_type() ->
  elements([<<"CAMPAIGN">>]).

