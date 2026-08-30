-module(openapi_delete_business_membership_200_response).

-include("openapi.hrl").

-export([openapi_delete_business_membership_200_response/0]).

-export([openapi_delete_business_membership_200_response/1]).

-export_type([openapi_delete_business_membership_200_response/0]).

-type openapi_delete_business_membership_200_response() ::
  [ {'deleted_members', list(binary()) }
  ].


openapi_delete_business_membership_200_response() ->
    openapi_delete_business_membership_200_response([]).

openapi_delete_business_membership_200_response(Fields) ->
  Default = [ {'deleted_members', list(binary()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

