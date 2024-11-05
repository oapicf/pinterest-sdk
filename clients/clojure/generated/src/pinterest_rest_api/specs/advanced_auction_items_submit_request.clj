(ns pinterest-rest-api.specs.advanced-auction-items-submit-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.advanced-auction-items-submit-record :refer :all]
            )
  (:import (java.io File)))


(def advanced-auction-items-submit-request-data
  {
   (ds/req :catalog_id) string?
   (ds/req :items) (s/coll-of advanced-auction-items-submit-record-spec)
   })

(def advanced-auction-items-submit-request-spec
  (ds/spec
    {:name ::advanced-auction-items-submit-request
     :spec advanced-auction-items-submit-request-data}))
