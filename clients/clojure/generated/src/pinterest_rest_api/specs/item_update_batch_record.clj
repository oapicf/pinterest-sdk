(ns pinterest-rest-api.specs.item-update-batch-record
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.updatable-item-attributes :refer :all]
            [pinterest-rest-api.specs.update-mask-field-type :refer :all]
            )
  (:import (java.io File)))


(def item-update-batch-record-data
  {
   (ds/opt :item_id) string?
   (ds/opt :attributes) updatable-item-attributes-spec
   (ds/opt :update_mask) (s/coll-of update-mask-field-type-spec)
   })

(def item-update-batch-record-spec
  (ds/spec
    {:name ::item-update-batch-record
     :spec item-update-batch-record-data}))
