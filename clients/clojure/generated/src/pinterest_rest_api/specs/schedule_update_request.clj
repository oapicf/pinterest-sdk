(ns pinterest-rest-api.specs.schedule-update-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.schedule-common-delta-value :refer :all]
            [pinterest-rest-api.specs.schedule-action :refer :all]
            [pinterest-rest-api.specs.schedule-status :refer :all]
            [pinterest-rest-api.specs.schedule-type :refer :all]
            )
  (:import (java.io File)))


(def schedule-update-request-data
  {
   (ds/opt :entity_id) string?
   (ds/opt :entity_type) string?
   (ds/req :id) string?
   (ds/opt :delta_value) schedule-common-delta-value-spec
   (ds/opt :end_timestamp) int?
   (ds/opt :name) string?
   (ds/opt :schedule_action) schedule-action-spec
   (ds/opt :schedule_status) schedule-status-spec
   (ds/opt :schedule_type) schedule-type-spec
   (ds/opt :start_timestamp) int?
   })

(def schedule-update-request-spec
  (ds/spec
    {:name ::schedule-update-request
     :spec schedule-update-request-data}))
