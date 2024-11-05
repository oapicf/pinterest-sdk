(ns pinterest-rest-api.specs.budget-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def budget-type-data
  {
   })

(def budget-type-spec
  (ds/spec
    {:name ::budget-type
     :spec budget-type-data}))
