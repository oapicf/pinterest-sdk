(ns pinterest-rest-api.specs.catalogs-hotel-batch-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.catalogs-items-request-language :refer :all]
            [pinterest-rest-api.specs.catalogs-hotel-batch-item :refer :all]
            )
  (:import (java.io File)))


(def catalogs-hotel-batch-request-data
  {
   (ds/req :catalog_type) string?
   (ds/req :country) country-spec
   (ds/req :language) catalogs-items-request-language-spec
   (ds/req :items) (s/coll-of catalogs-hotel-batch-item-spec)
   (ds/opt :catalog_id) string?
   })

(def catalogs-hotel-batch-request-spec
  (ds/spec
    {:name ::catalogs-hotel-batch-request
     :spec catalogs-hotel-batch-request-data}))
