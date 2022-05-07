(ns pinterest-rest-api.specs.non-nullable-catalogs-currency
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def non-nullable-catalogs-currency-data
  {
   })

(def non-nullable-catalogs-currency-spec
  (ds/spec
    {:name ::non-nullable-catalogs-currency
     :spec non-nullable-catalogs-currency-data}))
