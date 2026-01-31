(ns pinterest-rest-api.specs.conversion-msot-events
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.currency :refer :all]
            )
  (:import (java.io File)))


(def conversion-msot-events-data
  {
   (ds/opt :action_timestamps) (s/coll-of int?)
   (ds/req :ad_group_id) string?
   (ds/opt :attribution_model) string?
   (ds/req :attribution_scope) string?
   (ds/opt :attribution_score) float?
   (ds/opt :campaign_id) string?
   (ds/opt :currency) currency-spec
   (ds/req :event_id) string?
   (ds/req :event_name) string?
   (ds/req :event_timestamp) int?
   (ds/opt :total_event_touchpoints) int?
   (ds/opt :total_events) int?
   (ds/opt :value) float?
   })

(def conversion-msot-events-spec
  (ds/spec
    {:name ::conversion-msot-events
     :spec conversion-msot-events-data}))
