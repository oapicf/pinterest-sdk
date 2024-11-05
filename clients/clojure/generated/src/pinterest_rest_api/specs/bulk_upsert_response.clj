(ns pinterest-rest-api.specs.bulk-upsert-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def bulk-upsert-response-data
  {
   (ds/opt :request_id) string?
   })

(def bulk-upsert-response-spec
  (ds/spec
    {:name ::bulk-upsert-response
     :spec bulk-upsert-response-data}))
