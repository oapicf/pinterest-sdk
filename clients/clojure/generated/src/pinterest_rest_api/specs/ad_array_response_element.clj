(ns pinterest-rest-api.specs.ad-array-response-element
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ad-response :refer :all]
            [pinterest-rest-api.specs.exception :refer :all]
            )
  (:import (java.io File)))


(def ad-array-response-element-data
  {
   (ds/opt :data) ad-response-spec
   (ds/opt :exceptions) exception-spec
   })

(def ad-array-response-element-spec
  (ds/spec
    {:name ::ad-array-response-element
     :spec ad-array-response-element-data}))
