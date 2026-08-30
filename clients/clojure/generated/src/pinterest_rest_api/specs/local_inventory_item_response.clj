(ns pinterest-rest-api.specs.local-inventory-item-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.item-availability :refer :all]
            [pinterest-rest-api.specs.store-metadata :refer :all]
            )
  (:import (java.io File)))


(def local-inventory-item-response-data
  {
   (ds/opt :ad_link) string?
   (ds/opt :availability) item-availability-spec
   (ds/req :created_at) int?
   (ds/req :item_id) string?
   (ds/req :last_updated_time) int?
   (ds/opt :price) string?
   (ds/opt :sale_price) string?
   (ds/req :store_metadata) store-metadata-spec
   })

(def local-inventory-item-response-spec
  (ds/spec
    {:name ::local-inventory-item-response
     :spec local-inventory-item-response-data}))
