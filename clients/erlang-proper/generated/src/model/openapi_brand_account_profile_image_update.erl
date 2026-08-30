-module(openapi_brand_account_profile_image_update).

-include("openapi.hrl").

-export([openapi_brand_account_profile_image_update/0]).

-export([openapi_brand_account_profile_image_update/1]).

-export_type([openapi_brand_account_profile_image_update/0]).

-type openapi_brand_account_profile_image_update() ::
  [ {'content_type', binary() }
  | {'data', binary() }
  ].


openapi_brand_account_profile_image_update() ->
    openapi_brand_account_profile_image_update([]).

openapi_brand_account_profile_image_update(Fields) ->
  Default = [ {'content_type', elements([<<"image/jpeg">>, <<"image/png">>]) }
            , {'data', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

