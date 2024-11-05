(ns pinterest-rest-api.specs.catalogs-retail-batch-request-items-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.item-attributes-request :refer :all]
            [pinterest-rest-api.specs.update-mask-field-type :refer :all]
            )
  (:import (java.io File)))


(def catalogs-retail-batch-request-items-inner-data
  {
   (ds/req :item_id) string?
   (ds/req :operation) string?
   (ds/req :attributes) item-attributes-request-spec
   (ds/opt :update_mask) (s/coll-of update-mask-field-type-spec)
   })

(def catalogs-retail-batch-request-items-inner-spec
  (ds/spec
    {:name ::catalogs-retail-batch-request-items-inner
     :spec catalogs-retail-batch-request-items-inner-data}))
