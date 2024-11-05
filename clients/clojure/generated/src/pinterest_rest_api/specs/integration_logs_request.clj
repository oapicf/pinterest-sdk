(ns pinterest-rest-api.specs.integration-logs-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.integration-log :refer :all]
            )
  (:import (java.io File)))


(def integration-logs-request-data
  {
   (ds/req :logs) (s/coll-of integration-log-spec)
   })

(def integration-logs-request-spec
  (ds/spec
    {:name ::integration-logs-request
     :spec integration-logs-request-data}))
