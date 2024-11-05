(ns pinterest-rest-api.specs.item-delete-discontinued-batch-record
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def item-delete-discontinued-batch-record-data
  {
   (ds/opt :item_id) string?
   })

(def item-delete-discontinued-batch-record-spec
  (ds/spec
    {:name ::item-delete-discontinued-batch-record
     :spec item-delete-discontinued-batch-record-data}))
