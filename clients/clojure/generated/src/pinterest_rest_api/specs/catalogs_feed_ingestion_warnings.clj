(ns pinterest-rest-api.specs.catalogs-feed-ingestion-warnings
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-feed-ingestion-warnings-data
  {
   (ds/opt :ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR) int?
   (ds/opt :ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE) int?
   (ds/opt :ADDITIONAL_IMAGE_MALFORMED_URL) int?
   (ds/opt :ADDITIONAL_IMAGE_FILE_NOT_FOUND) int?
   (ds/opt :ADDITIONAL_IMAGE_INVALID_FILE) int?
   (ds/opt :HOTEL_PRICE_HEADER_IS_PRESENT) int?
   })

(def catalogs-feed-ingestion-warnings-spec
  (ds/spec
    {:name ::catalogs-feed-ingestion-warnings
     :spec catalogs-feed-ingestion-warnings-data}))
