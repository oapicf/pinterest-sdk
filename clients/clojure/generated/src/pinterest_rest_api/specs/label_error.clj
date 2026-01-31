(ns pinterest-rest-api.specs.label-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.label :refer :all]
            )
  (:import (java.io File)))


(def label-error-data
  {
   (ds/opt :data) label-spec
   (ds/opt :error_messages) (s/coll-of string?)
   })

(def label-error-spec
  (ds/spec
    {:name ::label-error
     :spec label-error-data}))
