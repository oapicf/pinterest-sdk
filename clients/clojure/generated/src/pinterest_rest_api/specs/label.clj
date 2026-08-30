(ns pinterest-rest-api.specs.label
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.nullable-label-type :refer :all]
            [pinterest-rest-api.specs.nullable-label-status :refer :all]
            )
  (:import (java.io File)))


(def label-data
  {
   (ds/req :id) string?
   (ds/req :label_type) nullable-label-type-spec
   (ds/opt :status) nullable-label-status-spec
   (ds/req :value) string?
   })

(def label-spec
  (ds/spec
    {:name ::label
     :spec label-data}))
