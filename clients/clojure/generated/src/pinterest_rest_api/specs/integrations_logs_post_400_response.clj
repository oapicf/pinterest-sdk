(ns pinterest-rest-api.specs.integrations-logs-post-400-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def integrations-logs-post-400-response-data
  {
   (ds/req :code) int?
   (ds/req :message) string?
   (ds/req :details) any?
   })

(def integrations-logs-post-400-response-spec
  (ds/spec
    {:name ::integrations-logs-post-400-response
     :spec integrations-logs-post-400-response-data}))
