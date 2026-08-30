(ns pinterest-rest-api.specs.delivery-metrics-get-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.delivery-metrics-response-items-items :refer :all]
            )
  (:import (java.io File)))


(def delivery-metrics-get-200-response-data
  {
   (ds/req :items) (s/coll-of delivery-metrics-response-items-items-spec)
   })

(def delivery-metrics-get-200-response-spec
  (ds/spec
    {:name ::delivery-metrics-get-200-response
     :spec delivery-metrics-get-200-response-data}))
