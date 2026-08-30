(ns pinterest-rest-api.specs.ssio-order-line-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ssio-order-line-type-data
  {
   })

(def ssio-order-line-type-spec
  (ds/spec
    {:name ::ssio-order-line-type
     :spec ssio-order-line-type-data}))
