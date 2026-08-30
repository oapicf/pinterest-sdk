(ns pinterest-rest-api.specs.campaign-batch-write-response-model
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.campaign-batch-item :refer :all]
            )
  (:import (java.io File)))


(def campaign-batch-write-response-model-data
  {
   (ds/req :items) (s/coll-of campaign-batch-item-spec)
   })

(def campaign-batch-write-response-model-spec
  (ds/spec
    {:name ::campaign-batch-write-response-model
     :spec campaign-batch-write-response-model-data}))
