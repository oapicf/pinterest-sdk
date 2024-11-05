(ns pinterest-rest-api.specs.catalogs-feed-ingestion-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-feed-ingestion-info-data
  {
   (ds/opt :IN_STOCK) int?
   (ds/opt :OUT_OF_STOCK) int?
   (ds/opt :PREORDER) int?
   })

(def catalogs-feed-ingestion-info-spec
  (ds/spec
    {:name ::catalogs-feed-ingestion-info
     :spec catalogs-feed-ingestion-info-data}))
