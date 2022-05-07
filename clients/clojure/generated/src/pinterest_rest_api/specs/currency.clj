(ns pinterest-rest-api.specs.currency
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def currency-data
  {
   })

(def currency-spec
  (ds/spec
    {:name ::currency
     :spec currency-data}))
