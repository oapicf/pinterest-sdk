-module(openapi_nullable_partner_type).

-include("openapi.hrl").

-export([openapi_nullable_partner_type/0]).

-export_type([openapi_nullable_partner_type/0]).

-type openapi_nullable_partner_type() ::
  binary().

openapi_nullable_partner_type() ->
  elements([<<"INTERNAL">>, <<"EXTERNAL">>, <<"">>]).

