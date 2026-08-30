-module(openapi_billing_profile_card_type).

-include("openapi.hrl").

-export([openapi_billing_profile_card_type/0]).

-export_type([openapi_billing_profile_card_type/0]).

-type openapi_billing_profile_card_type() ::
  binary().

openapi_billing_profile_card_type() ->
  elements([<<"UNKNOWN">>, <<"VISA">>, <<"MASTERCARD">>, <<"AMERICAN_EXPRESS">>, <<"DISCOVER">>, <<"ELO">>]).

