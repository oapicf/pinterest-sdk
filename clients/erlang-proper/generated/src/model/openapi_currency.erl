-module(openapi_currency).

-include("openapi.hrl").

-export([openapi_currency/0]).

-export_type([openapi_currency/0]).

-type openapi_currency() ::
  binary().

openapi_currency() ->
  elements([<<"UNK">>, <<"USD">>, <<"GBP">>, <<"CAD">>, <<"EUR">>, <<"AUD">>, <<"NZD">>, <<"SEK">>, <<"ILS">>, <<"CHF">>, <<"HKD">>, <<"JPY">>, <<"SGD">>, <<"KRW">>, <<"NOK">>, <<"DKK">>, <<"PLN">>, <<"RON">>, <<"HUF">>, <<"CZK">>, <<"BRL">>, <<"MXN">>, <<"ARS">>, <<"CLP">>, <<"COP">>]).

