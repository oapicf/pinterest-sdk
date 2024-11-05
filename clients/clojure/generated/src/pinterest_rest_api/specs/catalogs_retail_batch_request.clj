(ns pinterest-rest-api.specs.catalogs-retail-batch-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.catalogs-items-request-language :refer :all]
            [pinterest-rest-api.specs.catalogs-retail-batch-request-items-inner :refer :all]
            )
  (:import (java.io File)))


(def catalogs-retail-batch-request-data
  {
   (ds/req :catalog_type) string?
   (ds/req :country) country-spec
   (ds/req :language) catalogs-items-request-language-spec
   (ds/req :items) (s/coll-of catalogs-retail-batch-request-items-inner-spec)
   })

(def catalogs-retail-batch-request-spec
  (ds/spec
    {:name ::catalogs-retail-batch-request
     :spec catalogs-retail-batch-request-data}))
