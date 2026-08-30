(ns pinterest-rest-api.specs.local-inventory-operation-result
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.supplemental-item-validation-event :refer :all]
            [pinterest-rest-api.specs.supplemental-item-processing-status :refer :all]
            [pinterest-rest-api.specs.supplemental-item-validation-event :refer :all]
            )
  (:import (java.io File)))


(def local-inventory-operation-result-data
  {
   (ds/opt :errors) (s/coll-of supplemental-item-validation-event-spec)
   (ds/req :item_id) string?
   (ds/req :status) supplemental-item-processing-status-spec
   (ds/req :store_code) string?
   (ds/req :supplemental_type) string?
   (ds/opt :warnings) (s/coll-of supplemental-item-validation-event-spec)
   })

(def local-inventory-operation-result-spec
  (ds/spec
    {:name ::local-inventory-operation-result
     :spec local-inventory-operation-result-data}))
