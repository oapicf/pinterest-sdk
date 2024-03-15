-module(openapi_language).

-include("openapi.hrl").

-export([openapi_language/0]).

-export_type([openapi_language/0]).

-type openapi_language() ::
  binary().

openapi_language() ->
  elements([<<"AM">>, <<"AR">>, <<"AZ">>, <<"BG">>, <<"BN">>, <<"BS">>, <<"CA">>, <<"CS">>, <<"DA">>, <<"DV">>, <<"DZ">>, <<"DE">>, <<"EL">>, <<"EN">>, <<"ES">>, <<"ET">>, <<"FA">>, <<"FI">>, <<"FR">>, <<"HE">>, <<"HI">>, <<"HR">>, <<"HU">>, <<"HY">>, <<"ID">>, <<"IN">>, <<"IS">>, <<"IT">>, <<"IW">>, <<"JA">>, <<"KA">>, <<"KM">>, <<"KO">>, <<"LO">>, <<"LT">>, <<"LV">>, <<"MK">>, <<"MN">>, <<"MS">>, <<"MY">>, <<"NB">>, <<"NE">>, <<"NL">>, <<"NO">>, <<"PL">>, <<"PT">>, <<"RO">>, <<"RU">>, <<"SK">>, <<"SL">>, <<"SQ">>, <<"SR">>, <<"SV">>, <<"TL">>, <<"UK">>, <<"VI">>, <<"TE">>, <<"TH">>, <<"TR">>, <<"XX">>, <<"ZH">>]).

