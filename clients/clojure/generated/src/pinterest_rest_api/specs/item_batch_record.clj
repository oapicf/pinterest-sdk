(ns pinterest-rest-api.specs.item-batch-record
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.item-attributes-request :refer :all]
            [pinterest-rest-api.specs.update-mask-field-type :refer :all]
            )
  (:import (java.io File)))


(def item-batch-record-data
  {
   (ds/opt :item_id) string?
   (ds/opt :attributes) item-attributes-request-spec
   (ds/opt :update_mask) (s/coll-of update-mask-field-type-spec)
   })

(def item-batch-record-spec
  (ds/spec
    {:name ::item-batch-record
     :spec item-batch-record-data}))
