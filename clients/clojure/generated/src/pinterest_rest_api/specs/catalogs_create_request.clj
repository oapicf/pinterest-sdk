(ns pinterest-rest-api.specs.catalogs-create-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-create-request-data
  {
   (ds/req :catalog_type) string?
   (ds/req :name) string?
   })

(def catalogs-create-request-spec
  (ds/spec
    {:name ::catalogs-create-request
     :spec catalogs-create-request-data}))
