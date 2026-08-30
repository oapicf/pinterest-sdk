-module(openapi_public_targeting_type).

-include("openapi.hrl").

-export([openapi_public_targeting_type/0]).

-export_type([openapi_public_targeting_type/0]).

-type openapi_public_targeting_type() ::
  binary().

openapi_public_targeting_type() ->
  elements([<<"APPTYPE">>, <<"GENDER">>, <<"LOCALE">>, <<"AGE_BUCKET">>, <<"LOCATION">>, <<"GEO">>, <<"INTEREST">>, <<"KEYWORD">>, <<"AUDIENCE_INCLUDE">>, <<"AUDIENCE_EXCLUDE">>]).

