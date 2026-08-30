-module(openapi_form_factor).

-include("openapi.hrl").

-export([openapi_form_factor/0]).

-export_type([openapi_form_factor/0]).

-type openapi_form_factor() ::
  binary().

openapi_form_factor() ->
  elements([<<"desktop">>, <<"laptop">>, <<"cellphone">>, <<"tablet">>, <<"smartwatch">>, <<"tv">>, <<"vr">>, <<"console">>, <<"other">>]).

