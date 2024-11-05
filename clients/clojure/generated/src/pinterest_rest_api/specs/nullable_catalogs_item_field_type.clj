(ns pinterest-rest-api.specs.nullable-catalogs-item-field-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def nullable-catalogs-item-field-type-data
  {
   })

(def nullable-catalogs-item-field-type-spec
  (ds/spec
    {:name ::nullable-catalogs-item-field-type
     :spec nullable-catalogs-item-field-type-data}))
