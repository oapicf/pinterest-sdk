(ns pinterest-rest-api.specs.catalogs-items-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.catalogs-items-post-filters :refer :all]
            )
  (:import (java.io File)))


(def catalogs-items-request-data
  {
   (ds/req :country) country-spec
   (ds/req :language) string?
   (ds/req :filters) catalogs-items-post-filters-spec
   })

(def catalogs-items-request-spec
  (ds/spec
    {:name ::catalogs-items-request
     :spec catalogs-items-request-data}))
