(ns pinterest-rest-api.specs.schedule-batch-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.schedule-delta-value :refer :all]
            [pinterest-rest-api.specs.ad-account-entity-type :refer :all]
            [pinterest-rest-api.specs.schedule-action :refer :all]
            [pinterest-rest-api.specs.schedule-status :refer :all]
            [pinterest-rest-api.specs.schedule-type :refer :all]
            )
  (:import (java.io File)))


(def schedule-batch-update-data
  {
   (ds/opt :delta_value) schedule-delta-value-spec
   (ds/opt :end_timestamp) int?
   (ds/opt :entity_id) string?
   (ds/opt :entity_type) ad-account-entity-type-spec
   (ds/req :id) string?
   (ds/opt :name) string?
   (ds/opt :schedule_action) schedule-action-spec
   (ds/req :schedule_id) string?
   (ds/opt :schedule_status) schedule-status-spec
   (ds/opt :schedule_type) schedule-type-spec
   (ds/opt :start_timestamp) int?
   })

(def schedule-batch-update-spec
  (ds/spec
    {:name ::schedule-batch-update
     :spec schedule-batch-update-data}))
