(ns pinterest-rest-api.specs.batch-operation
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def batch-operation-data
  {
   })

(def batch-operation-spec
  (ds/spec
    {:name ::batch-operation
     :spec batch-operation-data}))
