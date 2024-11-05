(ns pinterest-rest-api.specs.catalogs-feed-validation-errors
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-feed-validation-errors-data
  {
   (ds/opt :FETCH_ERROR) int?
   (ds/opt :FETCH_INACTIVE_FEED_ERROR) int?
   (ds/opt :ENCODING_ERROR) int?
   (ds/opt :DELIMITER_ERROR) int?
   (ds/opt :REQUIRED_COLUMNS_MISSING) int?
   (ds/opt :DUPLICATE_PRODUCTS) int?
   (ds/opt :IMAGE_LINK_INVALID) int?
   (ds/opt :ITEMID_MISSING) int?
   (ds/opt :TITLE_MISSING) int?
   (ds/opt :DESCRIPTION_MISSING) int?
   (ds/opt :PRODUCT_LINK_MISSING) int?
   (ds/opt :IMAGE_LINK_MISSING) int?
   (ds/opt :AVAILABILITY_INVALID) int?
   (ds/opt :PRODUCT_PRICE_INVALID) int?
   (ds/opt :LINK_FORMAT_INVALID) int?
   (ds/opt :PARSE_LINE_ERROR) int?
   (ds/opt :ADWORDS_FORMAT_INVALID) int?
   (ds/opt :INTERNAL_SERVICE_ERROR) int?
   (ds/opt :NO_VERIFIED_DOMAIN) int?
   (ds/opt :ADULT_INVALID) int?
   (ds/opt :IMAGE_LINK_LENGTH_TOO_LONG) int?
   (ds/opt :INVALID_DOMAIN) int?
   (ds/opt :FEED_LENGTH_TOO_LONG) int?
   (ds/opt :LINK_LENGTH_TOO_LONG) int?
   (ds/opt :MALFORMED_XML) int?
   (ds/opt :PRICE_MISSING) int?
   (ds/opt :FEED_TOO_SMALL) int?
   (ds/opt :MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED) int?
   (ds/opt :ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE) int?
   (ds/opt :PINJOIN_CONTENT_UNSAFE) int?
   (ds/opt :BLOCKLISTED_IMAGE_SIGNATURE) int?
   (ds/opt :LIST_PRICE_INVALID) int?
   (ds/opt :PRICE_CANNOT_BE_DETERMINED) int?
   })

(def catalogs-feed-validation-errors-spec
  (ds/spec
    {:name ::catalogs-feed-validation-errors
     :spec catalogs-feed-validation-errors-data}))
