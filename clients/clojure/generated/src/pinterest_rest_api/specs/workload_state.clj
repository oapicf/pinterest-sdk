(ns pinterest-rest-api.specs.workload-state
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def workload-state-data
  {
   })

(def workload-state-spec
  (ds/spec
    {:name ::workload-state
     :spec workload-state-data}))
