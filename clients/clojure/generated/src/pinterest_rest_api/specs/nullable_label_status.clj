(ns pinterest-rest-api.specs.nullable-label-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def nullable-label-status-data
  {
   })

(def nullable-label-status-spec
  (ds/spec
    {:name ::nullable-label-status
     :spec nullable-label-status-data}))
