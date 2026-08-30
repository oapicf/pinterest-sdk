(ns pinterest-rest-api.specs.schedule-create-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.schedule-common-delta-value :refer :all]
            [pinterest-rest-api.specs.schedule-action :refer :all]
            [pinterest-rest-api.specs.schedule-status :refer :all]
            [pinterest-rest-api.specs.schedule-type :refer :all]
            )
  (:import (java.io File)))


(def schedule-create-request-data
  {
   (ds/req :entity_id) string?
   (ds/req :entity_type) string?
   (ds/req :delta_value) schedule-common-delta-value-spec
   (ds/req :end_timestamp) int?
   (ds/req :name) string?
   (ds/req :schedule_action) schedule-action-spec
   (ds/req :schedule_status) schedule-status-spec
   (ds/req :schedule_type) schedule-type-spec
   (ds/req :start_timestamp) int?
   })

(def schedule-create-request-spec
  (ds/spec
    {:name ::schedule-create-request
     :spec schedule-create-request-data}))
