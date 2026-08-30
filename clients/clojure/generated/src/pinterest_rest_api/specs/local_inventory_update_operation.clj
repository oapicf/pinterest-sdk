(ns pinterest-rest-api.specs.local-inventory-update-operation
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.retail-local-inventory-item-attributes-optional :refer :all]
            )
  (:import (java.io File)))


(def local-inventory-update-operation-data
  {
   (ds/req :attributes) retail-local-inventory-item-attributes-optional-spec
   (ds/req :item_id) string?
   (ds/req :operation) string?
   (ds/req :store_code) string?
   })

(def local-inventory-update-operation-spec
  (ds/spec
    {:name ::local-inventory-update-operation
     :spec local-inventory-update-operation-data}))
