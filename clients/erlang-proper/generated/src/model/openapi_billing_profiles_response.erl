-module(openapi_billing_profiles_response).

-include("openapi.hrl").

-export([openapi_billing_profiles_response/0]).

-export([openapi_billing_profiles_response/1]).

-export_type([openapi_billing_profiles_response/0]).

-type openapi_billing_profiles_response() ::
  [ {'advertiser_id', binary() }
  | {'billing_type', binary() }
  | {'card_type', binary() }
  | {'id', binary() }
  | {'payment_method_brand', binary() }
  | {'status', binary() }
  ].


openapi_billing_profiles_response() ->
    openapi_billing_profiles_response([]).

openapi_billing_profiles_response(Fields) ->
  Default = [ {'advertiser_id', binary() }
            , {'billing_type', elements([<<"CREDIT_CARD">>, <<"INVOICE">>, <<"INTERNAL">>, <<"RECURRING">>, <<"PREPAID">>]) }
            , {'card_type', elements([<<"UNKNOWN">>, <<"VISA">>, <<"MASTERCARD">>, <<"AMERICAN_EXPRESS">>, <<"DISCOVER">>, <<"ELO">>]) }
            , {'id', binary() }
            , {'payment_method_brand', elements([<<"UNKNOWN">>, <<"VISA">>, <<"MASTERCARD">>, <<"AMERICAN_EXPRESS">>, <<"DISCOVER">>, <<"SOFORT">>, <<"DINERS_CLUB">>, <<"ELO">>, <<"CARTE_BANCAIRE">>]) }
            , {'status', elements([<<"UNSPECIFIED">>, <<"VALID">>, <<"INVALID">>, <<"PENDING">>, <<"DELETED">>, <<"SECONDARY">>, <<"PENDING_SECONDARY">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

