(ns pinterest-rest-api.specs.catalogs-format
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-format-data
  {
   })

(def catalogs-format-spec
  (ds/spec
    {:name ::catalogs-format
     :spec catalogs-format-data}))
