-module(openapi_billing_profiles_get_200_response).

-include("openapi.hrl").

-export([openapi_billing_profiles_get_200_response/0]).

-export([openapi_billing_profiles_get_200_response/1]).

-export_type([openapi_billing_profiles_get_200_response/0]).

-type openapi_billing_profiles_get_200_response() ::
  [ {'items', list(openapi_billing_profiles_response:openapi_billing_profiles_response()) }
  | {'bookmark', binary() }
  ].


openapi_billing_profiles_get_200_response() ->
    openapi_billing_profiles_get_200_response([]).

openapi_billing_profiles_get_200_response(Fields) ->
  Default = [ {'items', list(openapi_billing_profiles_response:openapi_billing_profiles_response()) }
            , {'bookmark', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

