(ns pinterest-rest-api.specs.catalogs-creative-assets-feeds-create-request-default-locale
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def catalogs-creative-assets-feeds-create-request-default-locale-data
  {
   })

(def catalogs-creative-assets-feeds-create-request-default-locale-spec
  (ds/spec
    {:name ::catalogs-creative-assets-feeds-create-request-default-locale
     :spec catalogs-creative-assets-feeds-create-request-default-locale-data}))
