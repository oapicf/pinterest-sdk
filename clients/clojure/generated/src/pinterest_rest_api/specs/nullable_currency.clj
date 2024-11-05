(ns pinterest-rest-api.specs.nullable-currency
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def nullable-currency-data
  {
   })

(def nullable-currency-spec
  (ds/spec
    {:name ::nullable-currency
     :spec nullable-currency-data}))
