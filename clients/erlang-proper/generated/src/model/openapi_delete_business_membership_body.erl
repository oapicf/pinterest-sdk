-module(openapi_delete_business_membership_body).

-include("openapi.hrl").

-export([openapi_delete_business_membership_body/0]).

-export([openapi_delete_business_membership_body/1]).

-export_type([openapi_delete_business_membership_body/0]).

-type openapi_delete_business_membership_body() ::
  [ {'members', list(openapi_delete_business_membership_member:openapi_delete_business_membership_member()) }
  ].


openapi_delete_business_membership_body() ->
    openapi_delete_business_membership_body([]).

openapi_delete_business_membership_body(Fields) ->
  Default = [ {'members', list(openapi_delete_business_membership_member:openapi_delete_business_membership_member(), 1, 50) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

