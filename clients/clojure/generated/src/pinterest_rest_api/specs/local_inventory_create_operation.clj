(ns pinterest-rest-api.specs.local-inventory-create-operation
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.retail-local-inventory-item-attributes :refer :all]
            )
  (:import (java.io File)))


(def local-inventory-create-operation-data
  {
   (ds/req :attributes) retail-local-inventory-item-attributes-spec
   (ds/req :item_id) string?
   (ds/req :operation) string?
   (ds/req :store_code) string?
   })

(def local-inventory-create-operation-spec
  (ds/spec
    {:name ::local-inventory-create-operation
     :spec local-inventory-create-operation-data}))
