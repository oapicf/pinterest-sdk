-module(openapi_brand_account_update).

-include("openapi.hrl").

-export([openapi_brand_account_update/0]).

-export([openapi_brand_account_update/1]).

-export_type([openapi_brand_account_update/0]).

-type openapi_brand_account_update() ::
  [ {'about', binary() }
  | {'country', openapi_country:openapi_country() }
  | {'name', binary() }
  | {'profile_image', openapi_brand_account_profile_image_update:openapi_brand_account_profile_image_update() }
  | {'username', binary() }
  | {'website', binary() }
  ].


openapi_brand_account_update() ->
    openapi_brand_account_update([]).

openapi_brand_account_update(Fields) ->
  Default = [ {'about', binary() }
            , {'country', openapi_country:openapi_country() }
            , {'name', binary() }
            , {'profile_image', openapi_brand_account_profile_image_update:openapi_brand_account_profile_image_update() }
            , {'username', binary() }
            , {'website', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

