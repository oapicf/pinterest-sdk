-module(openapi_catalogs_items_request).

-include("openapi.hrl").

-export([openapi_catalogs_items_request/0]).

-export([openapi_catalogs_items_request/1]).

-export_type([openapi_catalogs_items_request/0]).

-type openapi_catalogs_items_request() ::
  [ {'country', openapi_country:openapi_country() }
  | {'language', binary() }
  | {'filters', openapi_catalogs_items_post_filters:openapi_catalogs_items_post_filters() }
  ].


openapi_catalogs_items_request() ->
    openapi_catalogs_items_request([]).

openapi_catalogs_items_request(Fields) ->
  Default = [ {'country', openapi_country:openapi_country() }
            , {'language', elements([<<"af-ZA">>, <<"ar-SA">>, <<"bg-BG">>, <<"bn-IN">>, <<"cs-CZ">>, <<"da-DK">>, <<"de">>, <<"el-GR">>, <<"en-AU">>, <<"en-CA">>, <<"en-GB">>, <<"en-IN">>, <<"en-US">>, <<"es-419">>, <<"es-AR">>, <<"es-ES">>, <<"es-MX">>, <<"fi-FI">>, <<"fr">>, <<"fr-CA">>, <<"he-IL">>, <<"hi-IN">>, <<"hr-HR">>, <<"hu-HU">>, <<"id-ID">>, <<"it">>, <<"ja">>, <<"ko-KR">>, <<"ms-MY">>, <<"nb-NO">>, <<"nl">>, <<"pl-PL">>, <<"pt-BR">>, <<"pt-PT">>, <<"ro-RO">>, <<"ru-RU">>, <<"sk-SK">>, <<"sv-SE">>, <<"te-IN">>, <<"th-TH">>, <<"tl-PH">>, <<"tr">>, <<"uk-UA">>, <<"vi-VN">>, <<"zh-CN">>, <<"zh-TW">>, <<"AM">>, <<"AR">>, <<"AZ">>, <<"BG">>, <<"BN">>, <<"BS">>, <<"CA">>, <<"CS">>, <<"DA">>, <<"DV">>, <<"DZ">>, <<"DE">>, <<"EL">>, <<"EN">>, <<"ES">>, <<"ET">>, <<"FA">>, <<"FI">>, <<"FR">>, <<"HE">>, <<"HI">>, <<"HR">>, <<"HU">>, <<"HY">>, <<"ID">>, <<"IN">>, <<"IS">>, <<"IT">>, <<"IW">>, <<"JA">>, <<"KA">>, <<"KM">>, <<"KO">>, <<"LO">>, <<"LT">>, <<"LV">>, <<"MK">>, <<"MN">>, <<"MS">>, <<"MY">>, <<"NB">>, <<"NE">>, <<"NL">>, <<"NO">>, <<"PL">>, <<"PT">>, <<"RO">>, <<"RU">>, <<"SK">>, <<"SL">>, <<"SQ">>, <<"SR">>, <<"SV">>, <<"TL">>, <<"UK">>, <<"VI">>, <<"TE">>, <<"TH">>, <<"TR">>, <<"XX">>, <<"ZH">>]) }
            , {'filters', openapi_catalogs_items_post_filters:openapi_catalogs_items_post_filters() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

