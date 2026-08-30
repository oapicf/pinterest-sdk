(ns pinterest-rest-api.specs.local-inventory-operation
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.retail-local-inventory-item-attributes :refer :all]
            )
  (:import (java.io File)))


(def local-inventory-operation-data
  {
   (ds/req :attributes) retail-local-inventory-item-attributes-spec
   (ds/req :item_id) string?
   (ds/req :operation) string?
   (ds/req :store_code) string?
   })

(def local-inventory-operation-spec
  (ds/spec
    {:name ::local-inventory-operation
     :spec local-inventory-operation-data}))
