-module(openapi_ad_account_owner).

-include("openapi.hrl").

-export([openapi_ad_account_owner/0]).

-export([openapi_ad_account_owner/1]).

-export_type([openapi_ad_account_owner/0]).

-type openapi_ad_account_owner() ::
  [ {'username', binary() }
  ].


openapi_ad_account_owner() ->
    openapi_ad_account_owner([]).

openapi_ad_account_owner(Fields) ->
  Default = [ {'username', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

