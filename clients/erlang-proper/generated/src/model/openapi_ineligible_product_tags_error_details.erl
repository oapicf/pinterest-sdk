-module(openapi_ineligible_product_tags_error_details).

-include("openapi.hrl").

-export([openapi_ineligible_product_tags_error_details/0]).

-export([openapi_ineligible_product_tags_error_details/1]).

-export_type([openapi_ineligible_product_tags_error_details/0]).

-type openapi_ineligible_product_tags_error_details() ::
  [ {'product_tags', list(openapi_ineligible_product_tag_error_item:openapi_ineligible_product_tag_error_item()) }
  ].


openapi_ineligible_product_tags_error_details() ->
    openapi_ineligible_product_tags_error_details([]).

openapi_ineligible_product_tags_error_details(Fields) ->
  Default = [ {'product_tags', list(openapi_ineligible_product_tag_error_item:openapi_ineligible_product_tag_error_item()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

