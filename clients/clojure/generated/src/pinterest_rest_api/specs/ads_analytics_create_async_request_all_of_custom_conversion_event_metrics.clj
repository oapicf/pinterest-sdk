(ns pinterest-rest-api.specs.ads-analytics-create-async-request-all-of-custom-conversion-event-metrics
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ads-analytics-create-async-request-all-of-custom-conversion-event-metrics-data
  {
   (ds/req :custom_event_metrics_type) string?
   (ds/req :custom_event_name) string?
   })

(def ads-analytics-create-async-request-all-of-custom-conversion-event-metrics-spec
  (ds/spec
    {:name ::ads-analytics-create-async-request-all-of-custom-conversion-event-metrics
     :spec ads-analytics-create-async-request-all-of-custom-conversion-event-metrics-data}))
