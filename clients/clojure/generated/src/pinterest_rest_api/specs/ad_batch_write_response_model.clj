(ns pinterest-rest-api.specs.ad-batch-write-response-model
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ad-batch-item :refer :all]
            )
  (:import (java.io File)))


(def ad-batch-write-response-model-data
  {
   (ds/req :items) (s/coll-of ad-batch-item-spec)
   })

(def ad-batch-write-response-model-spec
  (ds/spec
    {:name ::ad-batch-write-response-model
     :spec ad-batch-write-response-model-data}))
