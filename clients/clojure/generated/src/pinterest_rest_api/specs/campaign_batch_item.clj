(ns pinterest-rest-api.specs.campaign-batch-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.campaign-batch-response-data :refer :all]
            [pinterest-rest-api.specs.exception :refer :all]
            )
  (:import (java.io File)))


(def campaign-batch-item-data
  {
   (ds/opt :data) campaign-batch-response-data-spec
   (ds/opt :exceptions) (s/coll-of exception-spec)
   })

(def campaign-batch-item-spec
  (ds/spec
    {:name ::campaign-batch-item
     :spec campaign-batch-item-data}))
