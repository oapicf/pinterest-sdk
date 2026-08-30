(ns pinterest-rest-api.specs.catalogs-local-stores-create-200-response-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-local-stores-create-200-response-inner-data :refer :all]
            )
  (:import (java.io File)))


(def catalogs-local-stores-create-200-response-inner-data
  {
   (ds/req :data) catalogs-local-stores-create-200-response-inner-data-spec
   })

(def catalogs-local-stores-create-200-response-inner-spec
  (ds/spec
    {:name ::catalogs-local-stores-create-200-response-inner
     :spec catalogs-local-stores-create-200-response-inner-data}))
