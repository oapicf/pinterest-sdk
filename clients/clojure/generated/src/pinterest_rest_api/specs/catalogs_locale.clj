(ns pinterest-rest-api.specs.catalogs-locale
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-locale-data
  {
   })

(def catalogs-locale-spec
  (ds/spec
    {:name ::catalogs-locale
     :spec catalogs-locale-data}))
