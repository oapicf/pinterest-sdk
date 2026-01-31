(ns pinterest-rest-api.specs.labels-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.label-error :refer :all]
            [pinterest-rest-api.specs.label :refer :all]
            )
  (:import (java.io File)))


(def labels-response-data
  {
   (ds/opt :errors) (s/coll-of label-error-spec)
   (ds/opt :labels) (s/coll-of label-spec)
   })

(def labels-response-spec
  (ds/spec
    {:name ::labels-response
     :spec labels-response-data}))
