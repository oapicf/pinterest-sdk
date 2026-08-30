-module(openapi_product_tags_error).

-include("openapi.hrl").

-export([openapi_product_tags_error/0]).

-export([openapi_product_tags_error/1]).

-export_type([openapi_product_tags_error/0]).

-type openapi_product_tags_error() ::
  [ {'code', integer() }
  | {'details', openapi_ineligible_product_tags_error_details:openapi_ineligible_product_tags_error_details() }
  | {'message', binary() }
  ].


openapi_product_tags_error() ->
    openapi_product_tags_error([]).

openapi_product_tags_error(Fields) ->
  Default = [ {'code', integer() }
            , {'details', openapi_ineligible_product_tags_error_details:openapi_ineligible_product_tags_error_details() }
            , {'message', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

