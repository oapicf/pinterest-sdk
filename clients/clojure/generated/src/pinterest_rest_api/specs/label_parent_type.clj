(ns pinterest-rest-api.specs.label-parent-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def label-parent-type-data
  {
   })

(def label-parent-type-spec
  (ds/spec
    {:name ::label-parent-type
     :spec label-parent-type-data}))
