(ns pinterest-rest-api.specs.product-categories-demographic
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.gender-demographics :refer :all]
            )
  (:import (java.io File)))


(def product-categories-demographic-data
  {
   (ds/req :age) (s/map-of string? float?)
   (ds/req :gender) gender-demographics-spec
   })

(def product-categories-demographic-spec
  (ds/spec
    {:name ::product-categories-demographic
     :spec product-categories-demographic-data}))
