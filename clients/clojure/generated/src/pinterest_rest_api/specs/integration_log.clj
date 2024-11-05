(ns pinterest-rest-api.specs.integration-log
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.integration-log-client-error :refer :all]
            [pinterest-rest-api.specs.integration-log-client-request :refer :all]
            )
  (:import (java.io File)))


(def integration-log-data
  {
   (ds/req :client_timestamp) int?
   (ds/req :event_type) string?
   (ds/req :log_level) string?
   (ds/opt :external_business_id) string?
   (ds/opt :advertiser_id) string?
   (ds/opt :merchant_id) string?
   (ds/opt :tag_id) string?
   (ds/opt :feed_profile_id) string?
   (ds/opt :message) string?
   (ds/opt :app_version_number) string?
   (ds/opt :platform_version_number) string?
   (ds/opt :error) integration-log-client-error-spec
   (ds/opt :request) integration-log-client-request-spec
   })

(def integration-log-spec
  (ds/spec
    {:name ::integration-log
     :spec integration-log-data}))
