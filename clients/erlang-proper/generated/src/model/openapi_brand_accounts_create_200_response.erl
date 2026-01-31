-module(openapi_brand_accounts_create_200_response).

-include("openapi.hrl").

-export([openapi_brand_accounts_create_200_response/0]).

-export([openapi_brand_accounts_create_200_response/1]).

-export_type([openapi_brand_accounts_create_200_response/0]).

-type openapi_brand_accounts_create_200_response() ::
  [ {'brand_account_id', binary() }
  ].


openapi_brand_accounts_create_200_response() ->
    openapi_brand_accounts_create_200_response([]).

openapi_brand_accounts_create_200_response(Fields) ->
  Default = [ {'brand_account_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

