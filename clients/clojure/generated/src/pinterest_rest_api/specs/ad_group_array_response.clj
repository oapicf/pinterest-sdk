(ns pinterest-rest-api.specs.ad-group-array-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ad-group-array-response-element :refer :all]
            )
  (:import (java.io File)))


(def ad-group-array-response-data
  {
   (ds/opt :items) (s/coll-of ad-group-array-response-element-spec)
   })

(def ad-group-array-response-spec
  (ds/spec
    {:name ::ad-group-array-response
     :spec ad-group-array-response-data}))
