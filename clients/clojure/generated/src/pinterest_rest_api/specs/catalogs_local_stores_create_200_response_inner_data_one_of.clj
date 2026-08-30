(ns pinterest-rest-api.specs.catalogs-local-stores-create-200-response-inner-data-one-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.pinterest/lib/error :refer :all]
            )
  (:import (java.io File)))


(def catalogs-local-stores-create-200-response-inner-data-one-of-data
  {
   (ds/req :id) string?
   (ds/req :exceptions) pinterest/lib/error-spec
   })

(def catalogs-local-stores-create-200-response-inner-data-one-of-spec
  (ds/spec
    {:name ::catalogs-local-stores-create-200-response-inner-data-one-of
     :spec catalogs-local-stores-create-200-response-inner-data-one-of-data}))
