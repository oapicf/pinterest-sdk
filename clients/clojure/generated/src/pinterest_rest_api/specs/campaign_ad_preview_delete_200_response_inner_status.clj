(ns pinterest-rest-api.specs.campaign-ad-preview-delete-200-response-inner-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def campaign-ad-preview-delete-200-response-inner-status-data
  {
   (ds/req :statusCode) float?
   (ds/req :code) int?
   (ds/req :message) string?
   })

(def campaign-ad-preview-delete-200-response-inner-status-spec
  (ds/spec
    {:name ::campaign-ad-preview-delete-200-response-inner-status
     :spec campaign-ad-preview-delete-200-response-inner-status-data}))
