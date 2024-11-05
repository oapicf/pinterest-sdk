(ns pinterest-rest-api.specs.conversion-api-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.conversion-api-response-events-inner :refer :all]
            )
  (:import (java.io File)))


(def conversion-api-response-data
  {
   (ds/req :num_events_received) int?
   (ds/req :num_events_processed) int?
   (ds/req :events) (s/coll-of conversion-api-response-events-inner-spec)
   })

(def conversion-api-response-spec
  (ds/spec
    {:name ::conversion-api-response
     :spec conversion-api-response-data}))
