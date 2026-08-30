(ns pinterest-rest-api.specs.tie-breaker-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def tie-breaker-type-data
  {
   })

(def tie-breaker-type-spec
  (ds/spec
    {:name ::tie-breaker-type
     :spec tie-breaker-type-data}))
