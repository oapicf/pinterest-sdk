(ns pinterest-rest-api.specs.local-inventory-items-get-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.item-id-store-code-pair :refer :all]
            )
  (:import (java.io File)))


(def local-inventory-items-get-create-data
  {
   (ds/req :item_filters) (s/coll-of item-id-store-code-pair-spec)
   })

(def local-inventory-items-get-create-spec
  (ds/spec
    {:name ::local-inventory-items-get-create
     :spec local-inventory-items-get-create-data}))
