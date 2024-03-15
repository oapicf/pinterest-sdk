-module(openapi_catalogs_feed_validation_errors).

-include("openapi.hrl").

-export([openapi_catalogs_feed_validation_errors/0]).

-export([openapi_catalogs_feed_validation_errors/1]).

-export_type([openapi_catalogs_feed_validation_errors/0]).

-type openapi_catalogs_feed_validation_errors() ::
  [ {'FETCH_ERROR', integer() }
  | {'FETCH_INACTIVE_FEED_ERROR', integer() }
  | {'ENCODING_ERROR', integer() }
  | {'DELIMITER_ERROR', integer() }
  | {'REQUIRED_COLUMNS_MISSING', integer() }
  | {'DUPLICATE_PRODUCTS', integer() }
  | {'IMAGE_LINK_INVALID', integer() }
  | {'ITEMID_MISSING', integer() }
  | {'TITLE_MISSING', integer() }
  | {'DESCRIPTION_MISSING', integer() }
  | {'PRODUCT_LINK_MISSING', integer() }
  | {'IMAGE_LINK_MISSING', integer() }
  | {'AVAILABILITY_INVALID', integer() }
  | {'PRODUCT_PRICE_INVALID', integer() }
  | {'LINK_FORMAT_INVALID', integer() }
  | {'PARSE_LINE_ERROR', integer() }
  | {'ADWORDS_FORMAT_INVALID', integer() }
  | {'INTERNAL_SERVICE_ERROR', integer() }
  | {'NO_VERIFIED_DOMAIN', integer() }
  | {'ADULT_INVALID', integer() }
  | {'IMAGE_LINK_LENGTH_TOO_LONG', integer() }
  | {'INVALID_DOMAIN', integer() }
  | {'FEED_LENGTH_TOO_LONG', integer() }
  | {'LINK_LENGTH_TOO_LONG', integer() }
  | {'MALFORMED_XML', integer() }
  | {'PRICE_MISSING', integer() }
  | {'FEED_TOO_SMALL', integer() }
  | {'MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED', integer() }
  | {'ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE', integer() }
  | {'PINJOIN_CONTENT_UNSAFE', integer() }
  | {'BLOCKLISTED_IMAGE_SIGNATURE', integer() }
  | {'LIST_PRICE_INVALID', integer() }
  | {'PRICE_CANNOT_BE_DETERMINED', integer() }
  ].


openapi_catalogs_feed_validation_errors() ->
    openapi_catalogs_feed_validation_errors([]).

openapi_catalogs_feed_validation_errors(Fields) ->
  Default = [ {'FETCH_ERROR', integer() }
            , {'FETCH_INACTIVE_FEED_ERROR', integer() }
            , {'ENCODING_ERROR', integer() }
            , {'DELIMITER_ERROR', integer() }
            , {'REQUIRED_COLUMNS_MISSING', integer() }
            , {'DUPLICATE_PRODUCTS', integer() }
            , {'IMAGE_LINK_INVALID', integer() }
            , {'ITEMID_MISSING', integer() }
            , {'TITLE_MISSING', integer() }
            , {'DESCRIPTION_MISSING', integer() }
            , {'PRODUCT_LINK_MISSING', integer() }
            , {'IMAGE_LINK_MISSING', integer() }
            , {'AVAILABILITY_INVALID', integer() }
            , {'PRODUCT_PRICE_INVALID', integer() }
            , {'LINK_FORMAT_INVALID', integer() }
            , {'PARSE_LINE_ERROR', integer() }
            , {'ADWORDS_FORMAT_INVALID', integer() }
            , {'INTERNAL_SERVICE_ERROR', integer() }
            , {'NO_VERIFIED_DOMAIN', integer() }
            , {'ADULT_INVALID', integer() }
            , {'IMAGE_LINK_LENGTH_TOO_LONG', integer() }
            , {'INVALID_DOMAIN', integer() }
            , {'FEED_LENGTH_TOO_LONG', integer() }
            , {'LINK_LENGTH_TOO_LONG', integer() }
            , {'MALFORMED_XML', integer() }
            , {'PRICE_MISSING', integer() }
            , {'FEED_TOO_SMALL', integer() }
            , {'MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED', integer() }
            , {'ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE', integer() }
            , {'PINJOIN_CONTENT_UNSAFE', integer() }
            , {'BLOCKLISTED_IMAGE_SIGNATURE', integer() }
            , {'LIST_PRICE_INVALID', integer() }
            , {'PRICE_CANNOT_BE_DETERMINED', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

