(ns pinterest-rest-api.specs.catalogs-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-type-data
  {
   })

(def catalogs-type-spec
  (ds/spec
    {:name ::catalogs-type
     :spec catalogs-type-data}))
