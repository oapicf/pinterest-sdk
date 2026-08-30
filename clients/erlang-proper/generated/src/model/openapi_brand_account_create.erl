-module(openapi_brand_account_create).

-include("openapi.hrl").

-export([openapi_brand_account_create/0]).

-export([openapi_brand_account_create/1]).

-export_type([openapi_brand_account_create/0]).

-type openapi_brand_account_create() ::
  [ {'about', binary() }
  | {'country', openapi_country:openapi_country() }
  | {'name', binary() }
  | {'profile_image', openapi_brand_account_profile_image:openapi_brand_account_profile_image() }
  | {'username', binary() }
  | {'website', binary() }
  ].


openapi_brand_account_create() ->
    openapi_brand_account_create([]).

openapi_brand_account_create(Fields) ->
  Default = [ {'about', binary() }
            , {'country', openapi_country:openapi_country() }
            , {'name', binary() }
            , {'profile_image', openapi_brand_account_profile_image:openapi_brand_account_profile_image() }
            , {'username', binary() }
            , {'website', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

