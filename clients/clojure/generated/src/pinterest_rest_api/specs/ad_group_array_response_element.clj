(ns pinterest-rest-api.specs.ad-group-array-response-element
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ad-group-response :refer :all]
            [pinterest-rest-api.specs.exception :refer :all]
            )
  (:import (java.io File)))


(def ad-group-array-response-element-data
  {
   (ds/opt :data) ad-group-response-spec
   (ds/opt :exceptions) (s/coll-of exception-spec)
   })

(def ad-group-array-response-element-spec
  (ds/spec
    {:name ::ad-group-array-response-element
     :spec ad-group-array-response-element-data}))
