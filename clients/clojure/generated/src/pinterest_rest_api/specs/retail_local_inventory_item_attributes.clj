(ns pinterest-rest-api.specs.retail-local-inventory-item-attributes
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.item-availability :refer :all]
            )
  (:import (java.io File)))


(def retail-local-inventory-item-attributes-data
  {
   (ds/opt :ad_link) string?
   (ds/req :availability) item-availability-spec
   (ds/req :price) string?
   (ds/opt :sale_price) string?
   })

(def retail-local-inventory-item-attributes-spec
  (ds/spec
    {:name ::retail-local-inventory-item-attributes
     :spec retail-local-inventory-item-attributes-data}))
