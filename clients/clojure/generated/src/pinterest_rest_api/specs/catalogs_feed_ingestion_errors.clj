(ns pinterest-rest-api.specs.catalogs-feed-ingestion-errors
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-feed-ingestion-errors-data
  {
   (ds/opt :LINE_LEVEL_INTERNAL_ERROR) int?
   (ds/opt :LARGE_PRODUCT_COUNT_DECREASE) int?
   (ds/opt :ACCOUNT_FLAGGED) int?
   (ds/opt :IMAGE_LEVEL_INTERNAL_ERROR) int?
   (ds/opt :IMAGE_FILE_NOT_ACCESSIBLE) int?
   (ds/opt :IMAGE_MALFORMED_URL) int?
   (ds/opt :IMAGE_FILE_NOT_FOUND) int?
   (ds/opt :IMAGE_INVALID_FILE) int?
   })

(def catalogs-feed-ingestion-errors-spec
  (ds/spec
    {:name ::catalogs-feed-ingestion-errors
     :spec catalogs-feed-ingestion-errors-data}))
