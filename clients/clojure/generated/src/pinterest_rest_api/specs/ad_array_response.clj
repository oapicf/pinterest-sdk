(ns pinterest-rest-api.specs.ad-array-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ad-array-response-element :refer :all]
            )
  (:import (java.io File)))


(def ad-array-response-data
  {
   (ds/opt :items) (s/coll-of ad-array-response-element-spec)
   })

(def ad-array-response-spec
  (ds/spec
    {:name ::ad-array-response
     :spec ad-array-response-data}))
