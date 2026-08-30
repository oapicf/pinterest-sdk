(ns pinterest-rest-api.specs.primary-sort
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def primary-sort-data
  {
   })

(def primary-sort-spec
  (ds/spec
    {:name ::primary-sort
     :spec primary-sort-data}))
