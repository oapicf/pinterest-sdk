(ns pinterest-rest-api.specs.custom-conversion-event-metrics
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ade-column-type :refer :all]
            )
  (:import (java.io File)))


(def custom-conversion-event-metrics-data
  {
   (ds/req :custom_event_metrics_type) ade-column-type-spec
   (ds/req :custom_event_name) string?
   })

(def custom-conversion-event-metrics-spec
  (ds/spec
    {:name ::custom-conversion-event-metrics
     :spec custom-conversion-event-metrics-data}))
