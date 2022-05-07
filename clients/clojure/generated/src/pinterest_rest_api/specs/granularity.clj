(ns pinterest-rest-api.specs.granularity
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def granularity-data
  {
   })

(def granularity-spec
  (ds/spec
    {:name ::granularity
     :spec granularity-data}))
