(ns pinterest-rest-api.specs.advanced-auction-items-get-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.advanced-auction-items-get-record :refer :all]
            )
  (:import (java.io File)))


(def advanced-auction-items-get-request-data
  {
   (ds/req :catalog_id) string?
   (ds/req :items) (s/coll-of advanced-auction-items-get-record-spec)
   })

(def advanced-auction-items-get-request-spec
  (ds/spec
    {:name ::advanced-auction-items-get-request
     :spec advanced-auction-items-get-request-data}))
