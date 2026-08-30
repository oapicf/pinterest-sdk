(ns pinterest-rest-api.specs.conversion-events
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.conversion-api-response-events-items :refer :all]
            )
  (:import (java.io File)))


(def conversion-events-data
  {
   (ds/req :events) (s/coll-of conversion-api-response-events-items-spec)
   (ds/req :num_events_processed) int?
   (ds/req :num_events_received) int?
   })

(def conversion-events-spec
  (ds/spec
    {:name ::conversion-events
     :spec conversion-events-data}))
