(ns pinterest-rest-api.specs.label-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def label-status-data
  {
   })

(def label-status-spec
  (ds/spec
    {:name ::label-status
     :spec label-status-data}))
