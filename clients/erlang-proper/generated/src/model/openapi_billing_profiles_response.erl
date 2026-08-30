-module(openapi_billing_profiles_response).

-include("openapi.hrl").

-export([openapi_billing_profiles_response/0]).

-export([openapi_billing_profiles_response/1]).

-export_type([openapi_billing_profiles_response/0]).

-type openapi_billing_profiles_response() ::
  [ {'advertiser_id', binary() }
  | {'billing_type', openapi_billing_type:openapi_billing_type() }
  | {'card_type', openapi_billing_profile_card_type:openapi_billing_profile_card_type() }
  | {'id', binary() }
  | {'payment_method_brand', openapi_billing_profile_payment_method_brand:openapi_billing_profile_payment_method_brand() }
  | {'status', openapi_billing_profile_status:openapi_billing_profile_status() }
  ].


openapi_billing_profiles_response() ->
    openapi_billing_profiles_response([]).

openapi_billing_profiles_response(Fields) ->
  Default = [ {'advertiser_id', binary() }
            , {'billing_type', openapi_billing_type:openapi_billing_type() }
            , {'card_type', openapi_billing_profile_card_type:openapi_billing_profile_card_type() }
            , {'id', binary() }
            , {'payment_method_brand', openapi_billing_profile_payment_method_brand:openapi_billing_profile_payment_method_brand() }
            , {'status', openapi_billing_profile_status:openapi_billing_profile_status() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

