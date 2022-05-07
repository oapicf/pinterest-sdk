(ns pinterest-rest-api.specs.item-id-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def item-id-filter-data
  {
   (ds/req :ITEM_ID) catalogs-product-group-currency-criteria-spec
   })

(def item-id-filter-spec
  (ds/spec
    {:name ::item-id-filter
     :spec item-id-filter-data}))
