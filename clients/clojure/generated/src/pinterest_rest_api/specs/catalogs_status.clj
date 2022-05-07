(ns pinterest-rest-api.specs.catalogs-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-status-data
  {
   })

(def catalogs-status-spec
  (ds/spec
    {:name ::catalogs-status
     :spec catalogs-status-data}))
