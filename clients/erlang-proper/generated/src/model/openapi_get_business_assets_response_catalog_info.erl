-module(openapi_get_business_assets_response_catalog_info).

-include("openapi.hrl").

-export([openapi_get_business_assets_response_catalog_info/0]).

-export([openapi_get_business_assets_response_catalog_info/1]).

-export_type([openapi_get_business_assets_response_catalog_info/0]).

-type openapi_get_business_assets_response_catalog_info() ::
  [ {'catalog_type', binary() }
  | {'id', binary() }
  | {'name', binary() }
  ].


openapi_get_business_assets_response_catalog_info() ->
    openapi_get_business_assets_response_catalog_info([]).

openapi_get_business_assets_response_catalog_info(Fields) ->
  Default = [ {'catalog_type', binary() }
            , {'id', binary() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

