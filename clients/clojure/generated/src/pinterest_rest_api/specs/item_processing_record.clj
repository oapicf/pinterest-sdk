(ns pinterest-rest-api.specs.item-processing-record
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.item-validation-event :refer :all]
            [pinterest-rest-api.specs.item-validation-event :refer :all]
            [pinterest-rest-api.specs.item-processing-status :refer :all]
            )
  (:import (java.io File)))


(def item-processing-record-data
  {
   (ds/opt :item_id) string?
   (ds/opt :errors) (s/coll-of item-validation-event-spec)
   (ds/opt :warnings) (s/coll-of item-validation-event-spec)
   (ds/opt :status) item-processing-status-spec
   })

(def item-processing-record-spec
  (ds/spec
    {:name ::item-processing-record
     :spec item-processing-record-data}))
