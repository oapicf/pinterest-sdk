-module(openapi_catalogs_item_validation_errors).

-include("openapi.hrl").

-export([openapi_catalogs_item_validation_errors/0]).

-export([openapi_catalogs_item_validation_errors/1]).

-export_type([openapi_catalogs_item_validation_errors/0]).

-type openapi_catalogs_item_validation_errors() ::
  [ {'ADULT_INVALID', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
  | {'ADWORDS_FORMAT_INVALID', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
  | {'AVAILABILITY_INVALID', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
  | {'BLOCKLISTED_IMAGE_SIGNATURE', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
  | {'DESCRIPTION_MISSING', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
  | {'DUPLICATE_PRODUCTS', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
  | {'IMAGE_LINK_INVALID', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
  | {'IMAGE_LINK_LENGTH_TOO_LONG', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
  | {'IMAGE_LINK_MISSING', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
  | {'INVALID_DOMAIN', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
  | {'ITEMID_MISSING', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
  | {'ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
  | {'LINK_FORMAT_INVALID', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
  | {'LINK_LENGTH_TOO_LONG', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
  | {'LIST_PRICE_INVALID', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
  | {'MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
  | {'PARSE_LINE_ERROR', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
  | {'PINJOIN_CONTENT_UNSAFE', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
  | {'PRICE_CANNOT_BE_DETERMINED', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
  | {'PRICE_MISSING', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
  | {'PRODUCT_LINK_MISSING', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
  | {'PRODUCT_PRICE_INVALID', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
  | {'TITLE_MISSING', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
  ].


openapi_catalogs_item_validation_errors() ->
    openapi_catalogs_item_validation_errors([]).

openapi_catalogs_item_validation_errors(Fields) ->
  Default = [ {'ADULT_INVALID', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
            , {'ADWORDS_FORMAT_INVALID', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
            , {'AVAILABILITY_INVALID', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
            , {'BLOCKLISTED_IMAGE_SIGNATURE', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
            , {'DESCRIPTION_MISSING', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
            , {'DUPLICATE_PRODUCTS', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
            , {'IMAGE_LINK_INVALID', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
            , {'IMAGE_LINK_LENGTH_TOO_LONG', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
            , {'IMAGE_LINK_MISSING', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
            , {'INVALID_DOMAIN', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
            , {'ITEMID_MISSING', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
            , {'ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
            , {'LINK_FORMAT_INVALID', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
            , {'LINK_LENGTH_TOO_LONG', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
            , {'LIST_PRICE_INVALID', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
            , {'MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
            , {'PARSE_LINE_ERROR', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
            , {'PINJOIN_CONTENT_UNSAFE', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
            , {'PRICE_CANNOT_BE_DETERMINED', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
            , {'PRICE_MISSING', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
            , {'PRODUCT_LINK_MISSING', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
            , {'PRODUCT_PRICE_INVALID', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
            , {'TITLE_MISSING', openapi_catalogs_item_validation_details:openapi_catalogs_item_validation_details() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

