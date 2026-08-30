(ns pinterest-rest-api.specs.retail-local-inventory-item-attributes-optional
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.item-availability :refer :all]
            )
  (:import (java.io File)))


(def retail-local-inventory-item-attributes-optional-data
  {
   (ds/opt :ad_link) string?
   (ds/opt :availability) item-availability-spec
   (ds/opt :price) string?
   (ds/opt :sale_price) string?
   })

(def retail-local-inventory-item-attributes-optional-spec
  (ds/spec
    {:name ::retail-local-inventory-item-attributes-optional
     :spec retail-local-inventory-item-attributes-optional-data}))
