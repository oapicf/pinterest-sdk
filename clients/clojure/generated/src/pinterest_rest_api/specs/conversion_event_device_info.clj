(ns pinterest-rest-api.specs.conversion-event-device-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.form-factor :refer :all]
            [pinterest-rest-api.specs.network-type :refer :all]
            [pinterest-rest-api.specs.os-family :refer :all]
            )
  (:import (java.io File)))


(def conversion-event-device-info-data
  {
   (ds/opt :battery_level) int?
   (ds/opt :brand) string?
   (ds/opt :carrier) string?
   (ds/opt :cpu_cores) int?
   (ds/opt :external_storage_free_space) int?
   (ds/opt :external_storage_size) int?
   (ds/opt :form_factor) form-factor-spec
   (ds/opt :kernel_version) string?
   (ds/opt :languages) (s/coll-of string?)
   (ds/opt :locale) string?
   (ds/opt :model) string?
   (ds/opt :network_type) network-type-spec
   (ds/opt :os_family) os-family-spec
   (ds/opt :os_name) string?
   (ds/opt :os_release_name) string?
   (ds/opt :os_version) string?
   (ds/opt :screen_density) int?
   (ds/opt :screen_height) int?
   (ds/opt :screen_width) int?
   (ds/opt :storage_free_space) int?
   (ds/opt :storage_size) int?
   (ds/opt :timezone) string?
   (ds/opt :timezone_abbr) string?
   (ds/opt :type) string?
   })

(def conversion-event-device-info-spec
  (ds/spec
    {:name ::conversion-event-device-info
     :spec conversion-event-device-info-data}))
