(ns pinterest-rest-api.specs.label-create-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.label-create-request-labels-inner :refer :all]
            )
  (:import (java.io File)))


(def label-create-request-data
  {
   (ds/req :labels) (s/coll-of label-create-request-labels-inner-spec)
   (ds/req :parent_id) string?
   })

(def label-create-request-spec
  (ds/spec
    {:name ::label-create-request
     :spec label-create-request-data}))
