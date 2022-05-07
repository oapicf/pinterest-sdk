(ns pinterest-rest-api.specs.catalogs-feed-ingestion-errors
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-feed-ingestion-errors-data
  {
   (ds/opt :image_download_error) int?
   (ds/opt :image_download_connection_timeout) int?
   (ds/opt :image_format_unrecognize) int?
   (ds/opt :line_level_internal_error) int?
   (ds/opt :large_product_count_decrease) int?
   })

(def catalogs-feed-ingestion-errors-spec
  (ds/spec
    {:name ::catalogs-feed-ingestion-errors
     :spec catalogs-feed-ingestion-errors-data}))
