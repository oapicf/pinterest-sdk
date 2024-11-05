(ns pinterest-rest-api.specs.bulk-upsert-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.bulk-upsert-request-create :refer :all]
            [pinterest-rest-api.specs.bulk-upsert-request-update :refer :all]
            )
  (:import (java.io File)))


(def bulk-upsert-request-data
  {
   (ds/opt :create) bulk-upsert-request-create-spec
   (ds/opt :update) bulk-upsert-request-update-spec
   })

(def bulk-upsert-request-spec
  (ds/spec
    {:name ::bulk-upsert-request
     :spec bulk-upsert-request-data}))
