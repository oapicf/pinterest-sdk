-module(openapi_catalogs_product).

-include("openapi.hrl").

-export([openapi_catalogs_product/0]).

-export([openapi_catalogs_product/1]).

-export_type([openapi_catalogs_product/0]).

-type openapi_catalogs_product() ::
  [ {'metadata', openapi_catalogs_product_metadata:openapi_catalogs_product_metadata() }
  | {'pin', openapi_pin:openapi_pin() }
  ].


openapi_catalogs_product() ->
    openapi_catalogs_product([]).

openapi_catalogs_product(Fields) ->
  Default = [ {'metadata', openapi_catalogs_product_metadata:openapi_catalogs_product_metadata() }
            , {'pin', openapi_pin:openapi_pin() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

