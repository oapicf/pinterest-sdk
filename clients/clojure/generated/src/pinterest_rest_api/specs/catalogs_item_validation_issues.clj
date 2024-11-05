(ns pinterest-rest-api.specs.catalogs-item-validation-issues
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-item-validation-errors :refer :all]
            [pinterest-rest-api.specs.catalogs-item-validation-warnings :refer :all]
            )
  (:import (java.io File)))


(def catalogs-item-validation-issues-data
  {
   (ds/req :item_number) int?
   (ds/req :item_id) string?
   (ds/req :errors) catalogs-item-validation-errors-spec
   (ds/req :warnings) catalogs-item-validation-warnings-spec
   })

(def catalogs-item-validation-issues-spec
  (ds/spec
    {:name ::catalogs-item-validation-issues
     :spec catalogs-item-validation-issues-data}))
