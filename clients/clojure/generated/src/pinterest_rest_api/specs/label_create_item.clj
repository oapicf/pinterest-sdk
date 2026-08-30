(ns pinterest-rest-api.specs.label-create-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.label-type :refer :all]
            )
  (:import (java.io File)))


(def label-create-item-data
  {
   (ds/req :label_type) label-type-spec
   (ds/req :value) string?
   })

(def label-create-item-spec
  (ds/spec
    {:name ::label-create-item
     :spec label-create-item-data}))
