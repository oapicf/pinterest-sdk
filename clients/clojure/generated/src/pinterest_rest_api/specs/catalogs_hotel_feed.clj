(ns pinterest-rest-api.specs.catalogs-hotel-feed
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-feed-credentials :refer :all]
            [pinterest-rest-api.specs.nullable-currency :refer :all]
            [pinterest-rest-api.specs.catalogs-format :refer :all]
            [pinterest-rest-api.specs.catalogs-feed-processing-schedule :refer :all]
            [pinterest-rest-api.specs.catalogs-status :refer :all]
            )
  (:import (java.io File)))


(def catalogs-hotel-feed-data
  {
   (ds/req :catalog_id) string?
   (ds/req :catalog_type) string?
   (ds/req :created_at) inst?
   (ds/opt :credentials) catalogs-feed-credentials-spec
   (ds/opt :default_currency) nullable-currency-spec
   (ds/req :default_locale) string?
   (ds/req :format) catalogs-format-spec
   (ds/req :id) string?
   (ds/req :location) string?
   (ds/req :name) string?
   (ds/opt :preferred_processing_schedule) catalogs-feed-processing-schedule-spec
   (ds/req :status) catalogs-status-spec
   (ds/req :updated_at) inst?
   })

(def catalogs-hotel-feed-spec
  (ds/spec
    {:name ::catalogs-hotel-feed
     :spec catalogs-hotel-feed-data}))
