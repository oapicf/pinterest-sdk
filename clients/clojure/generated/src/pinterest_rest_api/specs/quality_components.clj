(ns pinterest-rest-api.specs.quality-components
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.quality-component-details :refer :all]
            [pinterest-rest-api.specs.quality-component-details :refer :all]
            [pinterest-rest-api.specs.quality-component-details :refer :all]
            [pinterest-rest-api.specs.quality-component-details :refer :all]
            [pinterest-rest-api.specs.quality-component-details :refer :all]
            [pinterest-rest-api.specs.quality-component-details :refer :all]
            [pinterest-rest-api.specs.quality-component-details :refer :all]
            [pinterest-rest-api.specs.quality-component-details :refer :all]
            [pinterest-rest-api.specs.quality-component-details :refer :all]
            [pinterest-rest-api.specs.quality-component-details :refer :all]
            [pinterest-rest-api.specs.quality-component-details :refer :all]
            )
  (:import (java.io File)))


(def quality-components-data
  {
   (ds/opt :advertiser_external_id) (s/map-of string? quality-component-details-spec)
   (ds/opt :click_id_epik) (s/map-of string? quality-component-details-spec)
   (ds/opt :external_event_id) (s/map-of string? quality-component-details-spec)
   (ds/opt :hashed_email) (s/map-of string? quality-component-details-spec)
   (ds/opt :hashed_maid) (s/map-of string? quality-component-details-spec)
   (ds/opt :ip_address) (s/map-of string? quality-component-details-spec)
   (ds/opt :order_id) (s/map-of string? quality-component-details-spec)
   (ds/opt :order_value) (s/map-of string? quality-component-details-spec)
   (ds/opt :product_id) (s/map-of string? quality-component-details-spec)
   (ds/opt :source_url) (s/map-of string? quality-component-details-spec)
   (ds/opt :user_agent) (s/map-of string? quality-component-details-spec)
   })

(def quality-components-spec
  (ds/spec
    {:name ::quality-components
     :spec quality-components-data}))
