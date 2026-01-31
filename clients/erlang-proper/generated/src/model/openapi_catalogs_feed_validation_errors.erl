-module(openapi_catalogs_feed_validation_errors).

-include("openapi.hrl").

-export([openapi_catalogs_feed_validation_errors/0]).

-export([openapi_catalogs_feed_validation_errors/1]).

-export_type([openapi_catalogs_feed_validation_errors/0]).

-type openapi_catalogs_feed_validation_errors() ::
  [ {'ADULT_INVALID', integer() }
  | {'ADWORDS_FORMAT_INVALID', integer() }
  | {'AVAILABILITY_INVALID', integer() }
  | {'BLOCKLISTED_IMAGE_SIGNATURE', integer() }
  | {'DELIMITER_ERROR', integer() }
  | {'DESCRIPTION_MISSING', integer() }
  | {'DUPLICATE_PRODUCTS', integer() }
  | {'ENCODING_ERROR', integer() }
  | {'FEED_LENGTH_TOO_LONG', integer() }
  | {'FEED_TOO_SMALL', integer() }
  | {'FETCH_ERROR', integer() }
  | {'FETCH_INACTIVE_FEED_ERROR', integer() }
  | {'IMAGE_LINK_INVALID', integer() }
  | {'IMAGE_LINK_LENGTH_TOO_LONG', integer() }
  | {'IMAGE_LINK_MISSING', integer() }
  | {'INTERNAL_SERVICE_ERROR', integer() }
  | {'INVALID_DOMAIN', integer() }
  | {'ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE', integer() }
  | {'ITEMID_MISSING', integer() }
  | {'LINK_FORMAT_INVALID', integer() }
  | {'LINK_LENGTH_TOO_LONG', integer() }
  | {'LIST_PRICE_INVALID', integer() }
  | {'MALFORMED_XML', integer() }
  | {'MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED', integer() }
  | {'NO_VERIFIED_DOMAIN', integer() }
  | {'PARSE_LINE_ERROR', integer() }
  | {'PINJOIN_CONTENT_UNSAFE', integer() }
  | {'PRICE_CANNOT_BE_DETERMINED', integer() }
  | {'PRICE_MISSING', integer() }
  | {'PRODUCT_LINK_MISSING', integer() }
  | {'PRODUCT_PRICE_INVALID', integer() }
  | {'REQUIRED_COLUMNS_MISSING', integer() }
  | {'TITLE_MISSING', integer() }
  ].


openapi_catalogs_feed_validation_errors() ->
    openapi_catalogs_feed_validation_errors([]).

openapi_catalogs_feed_validation_errors(Fields) ->
  Default = [ {'ADULT_INVALID', integer() }
            , {'ADWORDS_FORMAT_INVALID', integer() }
            , {'AVAILABILITY_INVALID', integer() }
            , {'BLOCKLISTED_IMAGE_SIGNATURE', integer() }
            , {'DELIMITER_ERROR', integer() }
            , {'DESCRIPTION_MISSING', integer() }
            , {'DUPLICATE_PRODUCTS', integer() }
            , {'ENCODING_ERROR', integer() }
            , {'FEED_LENGTH_TOO_LONG', integer() }
            , {'FEED_TOO_SMALL', integer() }
            , {'FETCH_ERROR', integer() }
            , {'FETCH_INACTIVE_FEED_ERROR', integer() }
            , {'IMAGE_LINK_INVALID', integer() }
            , {'IMAGE_LINK_LENGTH_TOO_LONG', integer() }
            , {'IMAGE_LINK_MISSING', integer() }
            , {'INTERNAL_SERVICE_ERROR', integer() }
            , {'INVALID_DOMAIN', integer() }
            , {'ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE', integer() }
            , {'ITEMID_MISSING', integer() }
            , {'LINK_FORMAT_INVALID', integer() }
            , {'LINK_LENGTH_TOO_LONG', integer() }
            , {'LIST_PRICE_INVALID', integer() }
            , {'MALFORMED_XML', integer() }
            , {'MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED', integer() }
            , {'NO_VERIFIED_DOMAIN', integer() }
            , {'PARSE_LINE_ERROR', integer() }
            , {'PINJOIN_CONTENT_UNSAFE', integer() }
            , {'PRICE_CANNOT_BE_DETERMINED', integer() }
            , {'PRICE_MISSING', integer() }
            , {'PRODUCT_LINK_MISSING', integer() }
            , {'PRODUCT_PRICE_INVALID', integer() }
            , {'REQUIRED_COLUMNS_MISSING', integer() }
            , {'TITLE_MISSING', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

