(ns pinterest-rest-api.specs.catalogs-item-validation-issue
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-item-validation-issue-data
  {
   })

(def catalogs-item-validation-issue-spec
  (ds/spec
    {:name ::catalogs-item-validation-issue
     :spec catalogs-item-validation-issue-data}))
