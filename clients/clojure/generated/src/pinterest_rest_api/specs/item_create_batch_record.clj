(ns pinterest-rest-api.specs.item-create-batch-record
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.item-attributes-request :refer :all]
            )
  (:import (java.io File)))


(def item-create-batch-record-data
  {
   (ds/opt :item_id) string?
   (ds/opt :attributes) item-attributes-request-spec
   })

(def item-create-batch-record-spec
  (ds/spec
    {:name ::item-create-batch-record
     :spec item-create-batch-record-data}))
