(ns pinterest-rest-api.specs.pin-filter
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pin-filter-data
  {
   })

(def pin-filter-spec
  (ds/spec
    {:name ::pin-filter
     :spec pin-filter-data}))
