(ns pinterest-rest-api.specs.product-group-promotion-customizable-cta-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def product-group-promotion-customizable-cta-type-data
  {
   })

(def product-group-promotion-customizable-cta-type-spec
  (ds/spec
    {:name ::product-group-promotion-customizable-cta-type
     :spec product-group-promotion-customizable-cta-type-data}))
