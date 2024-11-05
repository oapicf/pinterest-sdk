(ns pinterest-rest-api.specs.bulk-upsert-status-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.bulk-upsert-status :refer :all]
            )
  (:import (java.io File)))


(def bulk-upsert-status-response-data
  {
   (ds/opt :status) bulk-upsert-status-spec
   (ds/opt :result_url) string?
   })

(def bulk-upsert-status-response-spec
  (ds/spec
    {:name ::bulk-upsert-status-response
     :spec bulk-upsert-status-response-data}))
