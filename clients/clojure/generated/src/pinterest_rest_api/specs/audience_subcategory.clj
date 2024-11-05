(ns pinterest-rest-api.specs.audience-subcategory
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audience-subcategory-data
  {
   (ds/opt :key) string?
   (ds/opt :name) string?
   (ds/opt :ratio) float?
   (ds/opt :index) float?
   (ds/opt :id) string?
   })

(def audience-subcategory-spec
  (ds/spec
    {:name ::audience-subcategory
     :spec audience-subcategory-data}))
