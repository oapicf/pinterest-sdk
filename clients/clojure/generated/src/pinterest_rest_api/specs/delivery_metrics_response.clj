(ns pinterest-rest-api.specs.delivery-metrics-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.delivery-metrics-response-items-inner :refer :all]
            )
  (:import (java.io File)))


(def delivery-metrics-response-data
  {
   (ds/opt :items) (s/coll-of delivery-metrics-response-items-inner-spec)
   })

(def delivery-metrics-response-spec
  (ds/spec
    {:name ::delivery-metrics-response
     :spec delivery-metrics-response-data}))
