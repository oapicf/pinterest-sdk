-module(openapi_catalogs_hotel_batch_request).

-include("openapi.hrl").

-export([openapi_catalogs_hotel_batch_request/0]).

-export([openapi_catalogs_hotel_batch_request/1]).

-export_type([openapi_catalogs_hotel_batch_request/0]).

-type openapi_catalogs_hotel_batch_request() ::
  [ {'catalog_id', binary() }
  | {'catalog_type', binary() }
  | {'country', openapi_country:openapi_country() }
  | {'items', list(openapi_catalogs_hotel_batch_item:openapi_catalogs_hotel_batch_item()) }
  | {'language', binary() }
  ].


openapi_catalogs_hotel_batch_request() ->
    openapi_catalogs_hotel_batch_request([]).

openapi_catalogs_hotel_batch_request(Fields) ->
  Default = [ {'catalog_id', binary() }
            , {'catalog_type', elements([<<"HOTEL">>]) }
            , {'country', openapi_country:openapi_country() }
            , {'items', list(openapi_catalogs_hotel_batch_item:openapi_catalogs_hotel_batch_item(), 1, 1000) }
            , {'language', elements([<<"af-ZA">>, <<"ar-SA">>, <<"bg-BG">>, <<"bn-IN">>, <<"cs-CZ">>, <<"da-DK">>, <<"de">>, <<"el-GR">>, <<"en-AU">>, <<"en-CA">>, <<"en-GB">>, <<"en-IN">>, <<"en-US">>, <<"es-419">>, <<"es-AR">>, <<"es-ES">>, <<"es-MX">>, <<"fi-FI">>, <<"fr">>, <<"fr-CA">>, <<"he-IL">>, <<"hi-IN">>, <<"hr-HR">>, <<"hu-HU">>, <<"id-ID">>, <<"it">>, <<"ja">>, <<"ko-KR">>, <<"ms-MY">>, <<"nb-NO">>, <<"nl">>, <<"pl-PL">>, <<"pt-BR">>, <<"pt-PT">>, <<"ro-RO">>, <<"ru-RU">>, <<"sk-SK">>, <<"sv-SE">>, <<"te-IN">>, <<"th-TH">>, <<"tl-PH">>, <<"tr">>, <<"uk-UA">>, <<"vi-VN">>, <<"zh-CN">>, <<"zh-TW">>, <<"AM">>, <<"AR">>, <<"AZ">>, <<"BG">>, <<"BN">>, <<"BS">>, <<"CA">>, <<"CS">>, <<"DA">>, <<"DV">>, <<"DZ">>, <<"DE">>, <<"EL">>, <<"EN">>, <<"ES">>, <<"ET">>, <<"FA">>, <<"FI">>, <<"FR">>, <<"HE">>, <<"HI">>, <<"HR">>, <<"HU">>, <<"HY">>, <<"ID">>, <<"IN">>, <<"IS">>, <<"IT">>, <<"IW">>, <<"JA">>, <<"KA">>, <<"KM">>, <<"KO">>, <<"LO">>, <<"LT">>, <<"LV">>, <<"MK">>, <<"MN">>, <<"MS">>, <<"MY">>, <<"NB">>, <<"NE">>, <<"NL">>, <<"NO">>, <<"PL">>, <<"PT">>, <<"RO">>, <<"RU">>, <<"SK">>, <<"SL">>, <<"SQ">>, <<"SR">>, <<"SV">>, <<"TL">>, <<"UK">>, <<"VI">>, <<"TE">>, <<"TH">>, <<"TR">>, <<"XX">>, <<"ZH">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

