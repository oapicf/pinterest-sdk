(ns pinterest-rest-api.specs.catalogs-creative-assets-feeds-update-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-feed-credentials :refer :all]
            [pinterest-rest-api.specs.nullable-currency :refer :all]
            [pinterest-rest-api.specs.catalogs-format :refer :all]
            [pinterest-rest-api.specs.catalogs-feed-processing-schedule :refer :all]
            [pinterest-rest-api.specs.catalogs-status :refer :all]
            )
  (:import (java.io File)))


(def catalogs-creative-assets-feeds-update-request-data
  {
   (ds/req :catalog_type) string?
   (ds/opt :credentials) catalogs-feed-credentials-spec
   (ds/opt :default_currency) nullable-currency-spec
   (ds/opt :format) catalogs-format-spec
   (ds/opt :location) string?
   (ds/opt :name) string?
   (ds/opt :preferred_processing_schedule) catalogs-feed-processing-schedule-spec
   (ds/opt :status) catalogs-status-spec
   })

(def catalogs-creative-assets-feeds-update-request-spec
  (ds/spec
    {:name ::catalogs-creative-assets-feeds-update-request
     :spec catalogs-creative-assets-feeds-update-request-data}))
