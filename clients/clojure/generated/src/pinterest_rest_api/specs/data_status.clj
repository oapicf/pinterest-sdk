(ns pinterest-rest-api.specs.data-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def data-status-data
  {
   })

(def data-status-spec
  (ds/spec
    {:name ::data-status
     :spec data-status-data}))
