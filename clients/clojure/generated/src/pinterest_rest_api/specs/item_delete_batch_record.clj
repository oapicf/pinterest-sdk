(ns pinterest-rest-api.specs.item-delete-batch-record
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def item-delete-batch-record-data
  {
   (ds/opt :item_id) string?
   })

(def item-delete-batch-record-spec
  (ds/spec
    {:name ::item-delete-batch-record
     :spec item-delete-batch-record-data}))
