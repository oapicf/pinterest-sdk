(ns pinterest-rest-api.specs.catalogs-update-retail-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.updatable-item-attributes :refer :all]
            [pinterest-rest-api.specs.update-mask-field-type :refer :all]
            )
  (:import (java.io File)))


(def catalogs-update-retail-item-data
  {
   (ds/req :item_id) string?
   (ds/req :operation) string?
   (ds/req :attributes) updatable-item-attributes-spec
   (ds/opt :update_mask) (s/coll-of update-mask-field-type-spec)
   })

(def catalogs-update-retail-item-spec
  (ds/spec
    {:name ::catalogs-update-retail-item
     :spec catalogs-update-retail-item-data}))
