-module(openapi_ineligible_product_tag_reason).

-include("openapi.hrl").

-export([openapi_ineligible_product_tag_reason/0]).

-export_type([openapi_ineligible_product_tag_reason/0]).

-type openapi_ineligible_product_tag_reason() ::
  binary().

openapi_ineligible_product_tag_reason() ->
  elements([<<"PIN_MISSING">>, <<"PIN_IS_PRIVATE">>, <<"PRODUCT_METADATA_MISSING">>, <<"PIN_NOT_FROM_VERIFIED_DOMAIN">>, <<"PIN_NOT_FROM_SAME_USER_AS_HERO_PIN">>]).

