-module(openapi_billing_profiles_response).

-include("openapi.hrl").

-export([openapi_billing_profiles_response/0]).

-export([openapi_billing_profiles_response/1]).

-export_type([openapi_billing_profiles_response/0]).

-type openapi_billing_profiles_response() ::
  [ {'id', binary() }
  | {'card_type', binary() }
  | {'status', binary() }
  | {'advertiser_id', binary() }
  | {'payment_method_brand', binary() }
  ].


openapi_billing_profiles_response() ->
    openapi_billing_profiles_response([]).

openapi_billing_profiles_response(Fields) ->
  Default = [ {'id', binary() }
            , {'card_type', elements([<<"UNKNOWN">>, <<"VISA">>, <<"MASTERCARD">>, <<"AMERICAN_EXPRESS">>, <<"DISCOVER">>, <<"ELO">>]) }
            , {'status', elements([<<"UNSPECIFIED">>, <<"VALID">>, <<"INVALID">>, <<"PENDING">>, <<"DELETED">>, <<"SECONDARY">>, <<"PENDING_SECONDARY">>]) }
            , {'advertiser_id', binary() }
            , {'payment_method_brand', elements([<<"UNKNOWN">>, <<"VISA">>, <<"MASTERCARD">>, <<"AMERICAN_EXPRESS">>, <<"DISCOVER">>, <<"SOFORT">>, <<"DINERS_CLUB">>, <<"ELO">>, <<"CARTE_BANCAIRE">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

