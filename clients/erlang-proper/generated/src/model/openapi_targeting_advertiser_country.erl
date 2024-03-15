-module(openapi_targeting_advertiser_country).

-include("openapi.hrl").

-export([openapi_targeting_advertiser_country/0]).

-export_type([openapi_targeting_advertiser_country/0]).

-type openapi_targeting_advertiser_country() ::
  binary().

openapi_targeting_advertiser_country() ->
  elements([<<"US">>, <<"GB">>, <<"CA">>, <<"IE">>, <<"AU">>, <<"NZ">>, <<"FR">>, <<"SE">>, <<"IL">>, <<"DE">>, <<"AT">>, <<"IT">>, <<"ES">>, <<"NL">>, <<"BE">>, <<"PT">>, <<"CH">>, <<"HK">>, <<"JP">>, <<"KR">>, <<"SG">>, <<"NO">>, <<"DK">>, <<"FI">>, <<"CY">>, <<"LU">>, <<"MT">>, <<"PL">>, <<"RO">>, <<"HU">>, <<"CZ">>, <<"GR">>, <<"SK">>, <<"BR">>, <<"MX">>, <<"AR">>, <<"CL">>, <<"CO">>]).

