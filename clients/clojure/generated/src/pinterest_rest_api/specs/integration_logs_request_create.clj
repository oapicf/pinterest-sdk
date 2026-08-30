(ns pinterest-rest-api.specs.integration-logs-request-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.integration-log :refer :all]
            )
  (:import (java.io File)))


(def integration-logs-request-create-data
  {
   (ds/req :logs) (s/coll-of integration-log-spec)
   })

(def integration-logs-request-create-spec
  (ds/spec
    {:name ::integration-logs-request-create
     :spec integration-logs-request-create-data}))
