(ns pinterest-rest-api.specs.audience-category
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.audience-subcategory :refer :all]
            )
  (:import (java.io File)))


(def audience-category-data
  {
   (ds/opt :key) string?
   (ds/opt :name) string?
   (ds/opt :ratio) float?
   (ds/opt :index) float?
   (ds/opt :id) string?
   (ds/opt :subcategories) (s/coll-of audience-subcategory-spec)
   })

(def audience-category-spec
  (ds/spec
    {:name ::audience-category
     :spec audience-category-data}))
