(ns pinterest-rest-api.specs.label-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def label-type-data
  {
   })

(def label-type-spec
  (ds/spec
    {:name ::label-type
     :spec label-type-data}))
