(ns pinterest-rest-api.specs.advanced-auction-processed-items
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.advanced-auction-processed-item :refer :all]
            )
  (:import (java.io File)))


(def advanced-auction-processed-items-data
  {
   (ds/opt :catalog_id) string?
   (ds/opt :items) (s/coll-of advanced-auction-processed-item-spec)
   })

(def advanced-auction-processed-items-spec
  (ds/spec
    {:name ::advanced-auction-processed-items
     :spec advanced-auction-processed-items-data}))
