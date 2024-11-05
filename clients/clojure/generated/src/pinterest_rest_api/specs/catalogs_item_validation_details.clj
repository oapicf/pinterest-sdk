(ns pinterest-rest-api.specs.catalogs-item-validation-details
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.nullable-catalogs-item-field-type :refer :all]
            )
  (:import (java.io File)))


(def catalogs-item-validation-details-data
  {
   (ds/req :attribute_name) nullable-catalogs-item-field-type-spec
   (ds/req :provided_value) string?
   })

(def catalogs-item-validation-details-spec
  (ds/spec
    {:name ::catalogs-item-validation-details
     :spec catalogs-item-validation-details-data}))
