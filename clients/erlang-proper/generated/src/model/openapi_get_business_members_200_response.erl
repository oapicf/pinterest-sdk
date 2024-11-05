-module(openapi_get_business_members_200_response).

-include("openapi.hrl").

-export([openapi_get_business_members_200_response/0]).

-export([openapi_get_business_members_200_response/1]).

-export_type([openapi_get_business_members_200_response/0]).

-type openapi_get_business_members_200_response() ::
  [ {'items', list(openapi_user_business_role_binding:openapi_user_business_role_binding()) }
  | {'bookmark', binary() }
  ].


openapi_get_business_members_200_response() ->
    openapi_get_business_members_200_response([]).

openapi_get_business_members_200_response(Fields) ->
  Default = [ {'items', list(openapi_user_business_role_binding:openapi_user_business_role_binding()) }
            , {'bookmark', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

