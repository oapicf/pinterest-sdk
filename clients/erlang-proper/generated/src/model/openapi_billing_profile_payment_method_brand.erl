-module(openapi_billing_profile_payment_method_brand).

-include("openapi.hrl").

-export([openapi_billing_profile_payment_method_brand/0]).

-export_type([openapi_billing_profile_payment_method_brand/0]).

-type openapi_billing_profile_payment_method_brand() ::
  binary().

openapi_billing_profile_payment_method_brand() ->
  elements([<<"UNKNOWN">>, <<"VISA">>, <<"MASTERCARD">>, <<"AMERICAN_EXPRESS">>, <<"DISCOVER">>, <<"SOFORT">>, <<"DINERS_CLUB">>, <<"ELO">>, <<"CARTE_BANCAIRE">>]).

