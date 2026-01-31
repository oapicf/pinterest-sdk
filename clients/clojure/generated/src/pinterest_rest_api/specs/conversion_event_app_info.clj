(ns pinterest-rest-api.specs.conversion-event-app-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-event-app-info-data
  {
   (ds/opt :app_id) string?
   (ds/opt :app_name) string?
   (ds/opt :app_package_name) string?
   (ds/opt :app_store) string?
   (ds/opt :app_version) string?
   (ds/opt :install_time) int?
   (ds/opt :user_agent) string?
   (ds/opt :window_height) int?
   (ds/opt :window_width) int?
   })

(def conversion-event-app-info-spec
  (ds/spec
    {:name ::conversion-event-app-info
     :spec conversion-event-app-info-data}))
