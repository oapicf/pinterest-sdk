-module(openapi_brand_accounts_update_request).

-include("openapi.hrl").

-export([openapi_brand_accounts_update_request/0]).

-export([openapi_brand_accounts_update_request/1]).

-export_type([openapi_brand_accounts_update_request/0]).

-type openapi_brand_accounts_update_request() ::
  [ {'name', binary() }
  | {'username', binary() }
  | {'country', openapi_country:openapi_country() }
  | {'about', binary() }
  | {'website', binary() }
  | {'profile_image', openapi_image_base64:openapi_image_base64() }
  ].


openapi_brand_accounts_update_request() ->
    openapi_brand_accounts_update_request([]).

openapi_brand_accounts_update_request(Fields) ->
  Default = [ {'name', binary() }
            , {'username', binary() }
            , {'country', openapi_country:openapi_country() }
            , {'about', binary() }
            , {'website', binary() }
            , {'profile_image', openapi_image_base64:openapi_image_base64() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

