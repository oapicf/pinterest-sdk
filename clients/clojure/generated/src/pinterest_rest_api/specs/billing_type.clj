(ns pinterest-rest-api.specs.billing-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def billing-type-data
  {
   })

(def billing-type-spec
  (ds/spec
    {:name ::billing-type
     :spec billing-type-data}))
