(ns pinterest-rest-api.specs.conversion-product-attribution-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def conversion-product-attribution-type-data
  {
   })

(def conversion-product-attribution-type-spec
  (ds/spec
    {:name ::conversion-product-attribution-type
     :spec conversion-product-attribution-type-data}))
