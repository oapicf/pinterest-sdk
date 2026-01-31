-module(openapi_targeting_spec_gender).

-include("openapi.hrl").

-export([openapi_targeting_spec_gender/0]).

-export_type([openapi_targeting_spec_gender/0]).

-type openapi_targeting_spec_gender() ::
  binary().

openapi_targeting_spec_gender() ->
  elements([<<"unknown">>, <<"male">>, <<"female">>]).

