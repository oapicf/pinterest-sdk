(ns pinterest-rest-api.specs.catalogs-creative-assets-batch-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.catalogs-creative-assets-batch-item :refer :all]
            )
  (:import (java.io File)))


(def catalogs-creative-assets-batch-request-data
  {
   (ds/opt :catalog_id) string?
   (ds/req :catalog_type) string?
   (ds/req :country) country-spec
   (ds/req :items) (s/coll-of catalogs-creative-assets-batch-item-spec)
   (ds/req :language) string?
   })

(def catalogs-creative-assets-batch-request-spec
  (ds/spec
    {:name ::catalogs-creative-assets-batch-request
     :spec catalogs-creative-assets-batch-request-data}))
