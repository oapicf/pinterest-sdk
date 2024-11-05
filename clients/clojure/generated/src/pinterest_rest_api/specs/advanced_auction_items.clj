(ns pinterest-rest-api.specs.advanced-auction-items
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.advanced-auction-item :refer :all]
            )
  (:import (java.io File)))


(def advanced-auction-items-data
  {
   (ds/opt :catalog_id) string?
   (ds/opt :items) (s/coll-of advanced-auction-item-spec)
   })

(def advanced-auction-items-spec
  (ds/spec
    {:name ::advanced-auction-items
     :spec advanced-auction-items-data}))
