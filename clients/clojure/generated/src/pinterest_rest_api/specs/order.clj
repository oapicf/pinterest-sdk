(ns pinterest-rest-api.specs.order
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def order-data
  {
   })

(def order-spec
  (ds/spec
    {:name ::order
     :spec order-data}))
