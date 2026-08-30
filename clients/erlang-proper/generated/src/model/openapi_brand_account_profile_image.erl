-module(openapi_brand_account_profile_image).

-include("openapi.hrl").

-export([openapi_brand_account_profile_image/0]).

-export([openapi_brand_account_profile_image/1]).

-export_type([openapi_brand_account_profile_image/0]).

-type openapi_brand_account_profile_image() ::
  [ {'content_type', binary() }
  | {'data', binary() }
  ].


openapi_brand_account_profile_image() ->
    openapi_brand_account_profile_image([]).

openapi_brand_account_profile_image(Fields) ->
  Default = [ {'content_type', elements([<<"image/jpeg">>, <<"image/png">>]) }
            , {'data', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

