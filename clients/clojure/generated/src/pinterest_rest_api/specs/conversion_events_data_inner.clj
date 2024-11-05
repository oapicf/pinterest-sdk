(ns pinterest-rest-api.specs.conversion-events-data-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.conversion-events-user-data :refer :all]
            [pinterest-rest-api.specs.conversion-events-data-inner-custom-data :refer :all]
            )
  (:import (java.io File)))


(def conversion-events-data-inner-data
  {
   (ds/req :event_name) string?
   (ds/req :action_source) string?
   (ds/req :event_time) int?
   (ds/req :event_id) string?
   (ds/opt :event_source_url) string?
   (ds/opt :opt_out) boolean?
   (ds/opt :partner_name) string?
   (ds/req :user_data) conversion-events-user-data-spec
   (ds/opt :custom_data) conversion-events-data-inner-custom-data-spec
   (ds/opt :app_id) string?
   (ds/opt :app_name) string?
   (ds/opt :app_version) string?
   (ds/opt :device_brand) string?
   (ds/opt :device_carrier) string?
   (ds/opt :device_model) string?
   (ds/opt :device_type) string?
   (ds/opt :os_version) string?
   (ds/opt :wifi) boolean?
   (ds/opt :language) string?
   })

(def conversion-events-data-inner-spec
  (ds/spec
    {:name ::conversion-events-data-inner
     :spec conversion-events-data-inner-data}))
