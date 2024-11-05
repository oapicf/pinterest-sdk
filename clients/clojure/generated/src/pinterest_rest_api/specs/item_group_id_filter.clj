(ns pinterest-rest-api.specs.item-group-id-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def item-group-id-filter-data
  {
   (ds/req :ITEM_GROUP_ID) catalogs-product-group-multiple-string-criteria-spec
   })

(def item-group-id-filter-spec
  (ds/spec
    {:name ::item-group-id-filter
     :spec item-group-id-filter-data}))
