(ns pinterest-rest-api.specs.audience-demographic-value
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audience-demographic-value-data
  {
   (ds/opt :key) string?
   (ds/opt :name) string?
   (ds/opt :ratio) float?
   })

(def audience-demographic-value-spec
  (ds/spec
    {:name ::audience-demographic-value
     :spec audience-demographic-value-data}))
