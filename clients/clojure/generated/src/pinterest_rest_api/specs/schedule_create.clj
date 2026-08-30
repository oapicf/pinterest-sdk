(ns pinterest-rest-api.specs.schedule-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.schedule-delta-value :refer :all]
            [pinterest-rest-api.specs.ad-account-entity-type :refer :all]
            [pinterest-rest-api.specs.schedule-action :refer :all]
            [pinterest-rest-api.specs.schedule-status :refer :all]
            [pinterest-rest-api.specs.schedule-type :refer :all]
            )
  (:import (java.io File)))


(def schedule-create-data
  {
   (ds/opt :delta_value) schedule-delta-value-spec
   (ds/opt :end_timestamp) int?
   (ds/req :entity_id) string?
   (ds/opt :entity_type) ad-account-entity-type-spec
   (ds/opt :name) string?
   (ds/opt :schedule_action) schedule-action-spec
   (ds/opt :schedule_status) schedule-status-spec
   (ds/opt :schedule_type) schedule-type-spec
   (ds/opt :start_timestamp) int?
   })

(def schedule-create-spec
  (ds/spec
    {:name ::schedule-create
     :spec schedule-create-data}))
