(ns pinterest-rest-api.specs.bulk-upsert-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def bulk-upsert-status-data
  {
   })

(def bulk-upsert-status-spec
  (ds/spec
    {:name ::bulk-upsert-status
     :spec bulk-upsert-status-data}))
