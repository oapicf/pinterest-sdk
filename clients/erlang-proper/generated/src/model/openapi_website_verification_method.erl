-module(openapi_website_verification_method).

-include("openapi.hrl").

-export([openapi_website_verification_method/0]).

-export_type([openapi_website_verification_method/0]).

-type openapi_website_verification_method() ::
  binary().

openapi_website_verification_method() ->
  elements([<<"FILENAME">>, <<"METATAG">>, <<"DNSTXT">>]).

