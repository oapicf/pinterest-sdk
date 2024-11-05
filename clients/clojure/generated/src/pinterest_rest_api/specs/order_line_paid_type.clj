(ns pinterest-rest-api.specs.order-line-paid-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-line-paid-type-data
  {
   })

(def order-line-paid-type-spec
  (ds/spec
    {:name ::order-line-paid-type
     :spec order-line-paid-type-data}))
