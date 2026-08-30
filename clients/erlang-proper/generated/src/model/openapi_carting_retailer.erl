-module(openapi_carting_retailer).

-include("openapi.hrl").

-export([openapi_carting_retailer/0]).

-export([openapi_carting_retailer/1]).

-export_type([openapi_carting_retailer/0]).

-type openapi_carting_retailer() ::
  [ {'retailer_id', binary() }
  | {'retailer_name', binary() }
  ].


openapi_carting_retailer() ->
    openapi_carting_retailer([]).

openapi_carting_retailer(Fields) ->
  Default = [ {'retailer_id', binary() }
            , {'retailer_name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

