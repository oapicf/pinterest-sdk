(ns pinterest-rest-api.specs.label-create-request-labels-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.label-type :refer :all]
            )
  (:import (java.io File)))


(def label-create-request-labels-inner-data
  {
   (ds/req :label_type) label-type-spec
   (ds/req :value) string?
   })

(def label-create-request-labels-inner-spec
  (ds/spec
    {:name ::label-create-request-labels-inner
     :spec label-create-request-labels-inner-data}))
