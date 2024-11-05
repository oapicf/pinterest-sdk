(ns pinterest-rest-api.specs.get-audiences-order-by
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def get-audiences-order-by-data
  {
   })

(def get-audiences-order-by-spec
  (ds/spec
    {:name ::get-audiences-order-by
     :spec get-audiences-order-by-data}))
