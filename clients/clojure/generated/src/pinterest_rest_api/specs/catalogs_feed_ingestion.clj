(ns pinterest-rest-api.specs.catalogs-feed-ingestion
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-feed-processing-status :refer :all]
            )
  (:import (java.io File)))


(def catalogs-feed-ingestion-data
  {
   (ds/req :id) string?
   (ds/req :feed_id) string?
   (ds/req :created_at) inst?
   (ds/req :status) catalogs-feed-processing-status-spec
   })

(def catalogs-feed-ingestion-spec
  (ds/spec
    {:name ::catalogs-feed-ingestion
     :spec catalogs-feed-ingestion-data}))
