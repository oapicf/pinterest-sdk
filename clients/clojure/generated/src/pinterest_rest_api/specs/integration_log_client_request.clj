(ns pinterest-rest-api.specs.integration-log-client-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.http-method :refer :all]
            )
  (:import (java.io File)))


(def integration-log-client-request-data
  {
   (ds/req :host) string?
   (ds/req :method) http-method-spec
   (ds/req :path) string?
   (ds/opt :request_headers) (s/map-of string? string?)
   (ds/opt :response_headers) (s/map-of string? string?)
   (ds/opt :response_status_code) int?
   })

(def integration-log-client-request-spec
  (ds/spec
    {:name ::integration-log-client-request
     :spec integration-log-client-request-data}))
