(ns pinterest-rest-api.specs.ad-group-update-request-all-of1
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.targeting-spec-operations :refer :all]
            )
  (:import (java.io File)))


(def ad-group-update-request-all-of1-data
  {
   (ds/opt :bid_multiplier) float?
   (ds/req :id) string?
   (ds/opt :targeting_spec_operations) (s/coll-of targeting-spec-operations-spec)
   })

(def ad-group-update-request-all-of1-spec
  (ds/spec
    {:name ::ad-group-update-request-all-of1
     :spec ad-group-update-request-all-of1-data}))
