(ns pinterest-rest-api.specs.country
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def country-data
  {
   })

(def country-spec
  (ds/spec
    {:name ::country
     :spec country-data}))
