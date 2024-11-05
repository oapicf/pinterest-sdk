(ns pinterest-rest-api.specs.item-upsert-batch-record
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.item-attributes-request :refer :all]
            )
  (:import (java.io File)))


(def item-upsert-batch-record-data
  {
   (ds/opt :item_id) string?
   (ds/opt :attributes) item-attributes-request-spec
   })

(def item-upsert-batch-record-spec
  (ds/spec
    {:name ::item-upsert-batch-record
     :spec item-upsert-batch-record-data}))
