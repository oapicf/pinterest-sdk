-module(openapi_targeting_template_status).

-include("openapi.hrl").

-export([openapi_targeting_template_status/0]).

-export_type([openapi_targeting_template_status/0]).

-type openapi_targeting_template_status() ::
  binary().

openapi_targeting_template_status() ->
  elements([<<"ACTIVE">>, <<"DELETED">>]).

