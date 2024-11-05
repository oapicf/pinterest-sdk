(ns pinterest-rest-api.specs.ssio-insertion-orders-status-get-by-ad-account-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ssio-insertion-order-status :refer :all]
            )
  (:import (java.io File)))


(def ssio-insertion-orders-status-get-by-ad-account-200-response-data
  {
   (ds/req :items) (s/coll-of ssio-insertion-order-status-spec)
   (ds/opt :bookmark) string?
   })

(def ssio-insertion-orders-status-get-by-ad-account-200-response-spec
  (ds/spec
    {:name ::ssio-insertion-orders-status-get-by-ad-account-200-response
     :spec ssio-insertion-orders-status-get-by-ad-account-200-response-data}))
