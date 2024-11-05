(ns pinterest-rest-api.specs.catalogs-vertical-feeds-create-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.nullable-currency :refer :all]
            [pinterest-rest-api.specs.catalogs-format :refer :all]
            [pinterest-rest-api.specs.catalogs-feeds-create-request-default-locale :refer :all]
            [pinterest-rest-api.specs.catalogs-feed-credentials :refer :all]
            [pinterest-rest-api.specs.catalogs-feed-processing-schedule :refer :all]
            [pinterest-rest-api.specs.catalogs-type :refer :all]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.product-availability-type :refer :all]
            [pinterest-rest-api.specs.catalogs-status :refer :all]
            )
  (:import (java.io File)))


(def catalogs-vertical-feeds-create-request-data
  {
   (ds/opt :default_currency) nullable-currency-spec
   (ds/req :name) string?
   (ds/req :format) catalogs-format-spec
   (ds/req :default_locale) catalogs-feeds-create-request-default-locale-spec
   (ds/opt :credentials) catalogs-feed-credentials-spec
   (ds/req :location) string?
   (ds/opt :preferred_processing_schedule) catalogs-feed-processing-schedule-spec
   (ds/req :catalog_type) catalogs-type-spec
   (ds/req :default_country) country-spec
   (ds/opt :default_availability) product-availability-type-spec
   (ds/opt :status) catalogs-status-spec
   (ds/opt :catalog_id) string?
   })

(def catalogs-vertical-feeds-create-request-spec
  (ds/spec
    {:name ::catalogs-vertical-feeds-create-request
     :spec catalogs-vertical-feeds-create-request-data}))
