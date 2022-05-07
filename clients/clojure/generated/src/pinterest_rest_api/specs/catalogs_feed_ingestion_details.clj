(ns pinterest-rest-api.specs.catalogs-feed-ingestion-details
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-feed-ingestion-errors :refer :all]
            [pinterest-rest-api.specs.catalogs-feed-ingestion-info :refer :all]
            )
  (:import (java.io File)))


(def catalogs-feed-ingestion-details-data
  {
   (ds/req :errors) catalogs-feed-ingestion-errors-spec
   (ds/req :info) catalogs-feed-ingestion-info-spec
   })

(def catalogs-feed-ingestion-details-spec
  (ds/spec
    {:name ::catalogs-feed-ingestion-details
     :spec catalogs-feed-ingestion-details-data}))
