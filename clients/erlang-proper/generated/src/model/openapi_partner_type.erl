-module(openapi_partner_type).

-include("openapi.hrl").

-export([openapi_partner_type/0]).

-export_type([openapi_partner_type/0]).

-type openapi_partner_type() ::
  binary().

openapi_partner_type() ->
  elements([<<"INTERNAL">>, <<"EXTERNAL">>]).

