(ns pinterest-rest-api.specs.local-inventory-delete-operation
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def local-inventory-delete-operation-data
  {
   (ds/req :item_id) string?
   (ds/req :operation) string?
   (ds/req :store_code) string?
   })

(def local-inventory-delete-operation-spec
  (ds/spec
    {:name ::local-inventory-delete-operation
     :spec local-inventory-delete-operation-data}))
