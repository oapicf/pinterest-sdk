(ns pinterest-rest-api.specs.item-batch-record
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.item-attributes :refer :all]
            )
  (:import (java.io File)))


(def item-batch-record-data
  {
   (ds/opt :item_id) string?
   (ds/opt :attributes) item-attributes-spec
   })

(def item-batch-record-spec
  (ds/spec
    {:name ::item-batch-record
     :spec item-batch-record-data}))
