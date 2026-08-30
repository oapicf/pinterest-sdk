-module(openapi_ineligible_product_tag_error_item).

-include("openapi.hrl").

-export([openapi_ineligible_product_tag_error_item/0]).

-export([openapi_ineligible_product_tag_error_item/1]).

-export_type([openapi_ineligible_product_tag_error_item/0]).

-type openapi_ineligible_product_tag_error_item() ::
  [ {'error_message', openapi_ineligible_product_tag_reason:openapi_ineligible_product_tag_reason() }
  | {'pin_id', binary() }
  ].


openapi_ineligible_product_tag_error_item() ->
    openapi_ineligible_product_tag_error_item([]).

openapi_ineligible_product_tag_error_item(Fields) ->
  Default = [ {'error_message', openapi_ineligible_product_tag_reason:openapi_ineligible_product_tag_reason() }
            , {'pin_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

