(ns pinterest-rest-api.specs.catalogs-feeds-create-request-default-locale
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-feeds-create-request-default-locale-data
  {
   })

(def catalogs-feeds-create-request-default-locale-spec
  (ds/spec
    {:name ::catalogs-feeds-create-request-default-locale
     :spec catalogs-feeds-create-request-default-locale-data}))
