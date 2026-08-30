(ns pinterest-rest-api.specs.conversion-msot-events-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.attribution-model :refer :all]
            [pinterest-rest-api.specs.attribution-scope :refer :all]
            [pinterest-rest-api.specs.currency :refer :all]
            [pinterest-rest-api.specs.msot-event-name :refer :all]
            )
  (:import (java.io File)))


(def conversion-msot-events-create-data
  {
   (ds/opt :action_timestamps) (s/coll-of int?)
   (ds/req :ad_group_id) string?
   (ds/opt :attribution_model) attribution-model-spec
   (ds/opt :attribution_scope) attribution-scope-spec
   (ds/opt :attribution_score) float?
   (ds/opt :campaign_id) string?
   (ds/opt :click_window) string?
   (ds/opt :currency) currency-spec
   (ds/req :event_id) string?
   (ds/req :event_name) msot-event-name-spec
   (ds/req :event_timestamp) int?
   (ds/opt :total_event_touchpoints) int?
   (ds/opt :total_events) int?
   (ds/opt :total_events_fractional) float?
   (ds/opt :value) float?
   (ds/opt :view_window) string?
   })

(def conversion-msot-events-create-spec
  (ds/spec
    {:name ::conversion-msot-events-create
     :spec conversion-msot-events-create-data}))
