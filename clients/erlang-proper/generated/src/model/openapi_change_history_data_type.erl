-module(openapi_change_history_data_type).

-include("openapi.hrl").

-export([openapi_change_history_data_type/0]).

-export_type([openapi_change_history_data_type/0]).

-type openapi_change_history_data_type() ::
  binary().

openapi_change_history_data_type() ->
  elements([<<"STRING">>, <<"NUMERIC">>, <<"MICROCURRENCY">>, <<"DATE">>, <<"BOOL">>, <<"GENDER_LIST">>, <<"AGE_BUCKET_LIST">>, <<"APPTYPE_LIST">>, <<"COUNTRY_LIST">>, <<"LOCALE_LIST">>]).

