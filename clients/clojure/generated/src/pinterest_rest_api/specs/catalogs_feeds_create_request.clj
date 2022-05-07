(ns pinterest-rest-api.specs.catalogs-feeds-create-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.product-availability-type :refer :all]
            [pinterest-rest-api.specs.nullable-currency :refer :all]
            [pinterest-rest-api.specs.catalogs-format :refer :all]
            [pinterest-rest-api.specs.catalogs-feed-credentials :refer :all]
            [pinterest-rest-api.specs.catalogs-feed-processing-schedule :refer :all]
            )
  (:import (java.io File)))


(def catalogs-feeds-create-request-data
  {
   (ds/opt :default_country) country-spec
   (ds/opt :default_availability) product-availability-type-spec
   (ds/opt :default_currency) nullable-currency-spec
   (ds/req :name) string?
   (ds/req :format) catalogs-format-spec
   (ds/opt :default_locale) string?
   (ds/opt :credentials) catalogs-feed-credentials-spec
   (ds/req :location) string?
   (ds/opt :preferred_processing_schedule) catalogs-feed-processing-schedule-spec
   })

(def catalogs-feeds-create-request-spec
  (ds/spec
    {:name ::catalogs-feeds-create-request
     :spec catalogs-feeds-create-request-data}))
