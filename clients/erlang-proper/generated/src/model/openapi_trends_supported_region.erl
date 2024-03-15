-module(openapi_trends_supported_region).

-include("openapi.hrl").

-export([openapi_trends_supported_region/0]).

-export_type([openapi_trends_supported_region/0]).

-type openapi_trends_supported_region() ::
  binary().

openapi_trends_supported_region() ->
  elements([<<"US">>, <<"CA">>, <<"DE">>, <<"FR">>, <<"ES">>, <<"IT">>, <<"DE+AT+CH">>, <<"GB+IE">>, <<"IT+ES+PT+GR+MT">>, <<"PL+RO+HU+SK+CZ">>, <<"SE+DK+FI+NO">>, <<"NL+BE+LU">>, <<"AR">>, <<"BR">>, <<"CO">>, <<"MX">>, <<"MX+AR+CO+CL">>, <<"AU+NZ">>]).

