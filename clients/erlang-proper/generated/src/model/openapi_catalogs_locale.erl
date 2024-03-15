-module(openapi_catalogs_locale).

-include("openapi.hrl").

-export([openapi_catalogs_locale/0]).

-export_type([openapi_catalogs_locale/0]).

-type openapi_catalogs_locale() ::
  binary().

openapi_catalogs_locale() ->
  elements([<<"af-ZA">>, <<"ar-SA">>, <<"bg-BG">>, <<"bn-IN">>, <<"cs-CZ">>, <<"da-DK">>, <<"de">>, <<"el-GR">>, <<"en-AU">>, <<"en-CA">>, <<"en-GB">>, <<"en-IN">>, <<"en-US">>, <<"es-419">>, <<"es-AR">>, <<"es-ES">>, <<"es-MX">>, <<"fi-FI">>, <<"fr">>, <<"fr-CA">>, <<"he-IL">>, <<"hi-IN">>, <<"hr-HR">>, <<"hu-HU">>, <<"id-ID">>, <<"it">>, <<"ja">>, <<"ko-KR">>, <<"ms-MY">>, <<"nb-NO">>, <<"nl">>, <<"pl-PL">>, <<"pt-BR">>, <<"pt-PT">>, <<"ro-RO">>, <<"ru-RU">>, <<"sk-SK">>, <<"sv-SE">>, <<"te-IN">>, <<"th-TH">>, <<"tl-PH">>, <<"tr">>, <<"uk-UA">>, <<"vi-VN">>, <<"zh-CN">>, <<"zh-TW">>]).

