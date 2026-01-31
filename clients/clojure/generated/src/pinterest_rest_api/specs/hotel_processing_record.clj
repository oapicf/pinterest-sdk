(ns pinterest-rest-api.specs.hotel-processing-record
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.item-validation-event :refer :all]
            [pinterest-rest-api.specs.item-processing-status :refer :all]
            [pinterest-rest-api.specs.item-validation-event :refer :all]
            )
  (:import (java.io File)))


(def hotel-processing-record-data
  {
   (ds/opt :errors) (s/coll-of item-validation-event-spec)
   (ds/opt :hotel_id) string?
   (ds/opt :status) item-processing-status-spec
   (ds/opt :warnings) (s/coll-of item-validation-event-spec)
   })

(def hotel-processing-record-spec
  (ds/spec
    {:name ::hotel-processing-record
     :spec hotel-processing-record-data}))
