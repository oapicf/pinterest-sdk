(ns pinterest-rest-api.specs.conversion-events-data-items
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.conversion-event-app-info :refer :all]
            [pinterest-rest-api.specs.conversion-events-data-items-custom-data :refer :all]
            [pinterest-rest-api.specs.conversion-event-device-info :refer :all]
            [pinterest-rest-api.specs.conversion-events-user-data-properties :refer :all]
            )
  (:import (java.io File)))


(def conversion-events-data-items-data
  {
   (ds/req :action_source) string?
   (ds/opt :app_id) string?
   (ds/opt :app_info) conversion-event-app-info-spec
   (ds/opt :app_name) string?
   (ds/opt :app_version) string?
   (ds/opt :custom_data) conversion-events-data-items-custom-data-spec
   (ds/opt :device_brand) string?
   (ds/opt :device_carrier) string?
   (ds/opt :device_info) conversion-event-device-info-spec
   (ds/opt :device_model) string?
   (ds/opt :device_type) string?
   (ds/req :event_id) string?
   (ds/req :event_name) string?
   (ds/opt :event_source_url) string?
   (ds/req :event_time) int?
   (ds/opt :language) string?
   (ds/opt :opt_out) boolean?
   (ds/opt :os_version) string?
   (ds/opt :partner_name) string?
   (ds/req :user_data) conversion-events-user-data-properties-spec
   (ds/opt :wifi) boolean?
   })

(def conversion-events-data-items-spec
  (ds/spec
    {:name ::conversion-events-data-items
     :spec conversion-events-data-items-data}))
