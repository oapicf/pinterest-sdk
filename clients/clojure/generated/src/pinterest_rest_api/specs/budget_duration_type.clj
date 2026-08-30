(ns pinterest-rest-api.specs.budget-duration-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def budget-duration-type-data
  {
   })

(def budget-duration-type-spec
  (ds/spec
    {:name ::budget-duration-type
     :spec budget-duration-type-data}))
