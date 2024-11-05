(ns pinterest-rest-api.specs.catalogs-item-validation-errors
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-details :refer :all]
            )
  (:import (java.io File)))


(def catalogs-item-validation-errors-data
  {
   (ds/opt :ADULT_INVALID) catalogs-item-validation-details-spec
   (ds/opt :ADWORDS_FORMAT_INVALID) catalogs-item-validation-details-spec
   (ds/opt :AVAILABILITY_INVALID) catalogs-item-validation-details-spec
   (ds/opt :BLOCKLISTED_IMAGE_SIGNATURE) catalogs-item-validation-details-spec
   (ds/opt :DESCRIPTION_MISSING) catalogs-item-validation-details-spec
   (ds/opt :DUPLICATE_PRODUCTS) catalogs-item-validation-details-spec
   (ds/opt :IMAGE_LINK_INVALID) catalogs-item-validation-details-spec
   (ds/opt :IMAGE_LINK_LENGTH_TOO_LONG) catalogs-item-validation-details-spec
   (ds/opt :IMAGE_LINK_MISSING) catalogs-item-validation-details-spec
   (ds/opt :INVALID_DOMAIN) catalogs-item-validation-details-spec
   (ds/opt :ITEMID_MISSING) catalogs-item-validation-details-spec
   (ds/opt :ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE) catalogs-item-validation-details-spec
   (ds/opt :LINK_FORMAT_INVALID) catalogs-item-validation-details-spec
   (ds/opt :LINK_LENGTH_TOO_LONG) catalogs-item-validation-details-spec
   (ds/opt :LIST_PRICE_INVALID) catalogs-item-validation-details-spec
   (ds/opt :MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED) catalogs-item-validation-details-spec
   (ds/opt :PARSE_LINE_ERROR) catalogs-item-validation-details-spec
   (ds/opt :PINJOIN_CONTENT_UNSAFE) catalogs-item-validation-details-spec
   (ds/opt :PRICE_CANNOT_BE_DETERMINED) catalogs-item-validation-details-spec
   (ds/opt :PRICE_MISSING) catalogs-item-validation-details-spec
   (ds/opt :PRODUCT_LINK_MISSING) catalogs-item-validation-details-spec
   (ds/opt :PRODUCT_PRICE_INVALID) catalogs-item-validation-details-spec
   (ds/opt :TITLE_MISSING) catalogs-item-validation-details-spec
   })

(def catalogs-item-validation-errors-spec
  (ds/spec
    {:name ::catalogs-item-validation-errors
     :spec catalogs-item-validation-errors-data}))
