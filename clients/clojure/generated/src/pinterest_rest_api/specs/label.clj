(ns pinterest-rest-api.specs.label
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.label-type :refer :all]
            [pinterest-rest-api.specs.label-status :refer :all]
            )
  (:import (java.io File)))


(def label-data
  {
   (ds/opt :id) string?
   (ds/opt :label_type) label-type-spec
   (ds/opt :parent_id) string?
   (ds/opt :parent_type) string?
   (ds/opt :status) label-status-spec
   (ds/opt :value) string?
   })

(def label-spec
  (ds/spec
    {:name ::label
     :spec label-data}))
