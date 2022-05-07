(ns pinterest-rest-api.specs.feed-fields
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.country :refer :all]
            [pinterest-rest-api.specs.product-availability-type :refer :all]
            [pinterest-rest-api.specs.nullable-currency :refer :all]
            [pinterest-rest-api.specs.catalogs-format :refer :all]
            [pinterest-rest-api.specs.catalogs-feed-credentials :refer :all]
            [pinterest-rest-api.specs.catalogs-feed-processing-schedule :refer :all]
            [pinterest-rest-api.specs.catalogs-status :refer :all]
            )
  (:import (java.io File)))


(def feed-fields-data
  {
   (ds/req :default_country) country-spec
   (ds/req :default_availability) product-availability-type-spec
   (ds/req :default_currency) nullable-currency-spec
   (ds/req :name) string?
   (ds/req :format) catalogs-format-spec
   (ds/req :default_locale) string?
   (ds/req :credentials) catalogs-feed-credentials-spec
   (ds/req :location) string?
   (ds/req :preferred_processing_schedule) catalogs-feed-processing-schedule-spec
   (ds/req :status) catalogs-status-spec
   })

(def feed-fields-spec
  (ds/spec
    {:name ::feed-fields
     :spec feed-fields-data}))
