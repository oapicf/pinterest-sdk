(ns pinterest-rest-api.specs.catalogs-feed-ingestion-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-feed-ingestion-info-data
  {
   (ds/opt :in_stock) int?
   (ds/opt :out_of_stock) int?
   (ds/opt :preorder) int?
   })

(def catalogs-feed-ingestion-info-spec
  (ds/spec
    {:name ::catalogs-feed-ingestion-info
     :spec catalogs-feed-ingestion-info-data}))
