(ns pinterest-rest-api.specs.campaign-ad-preview-delete-200-response-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.campaign-ad-preview-delete-200-response-inner-status :refer :all]
            )
  (:import (java.io File)))


(def campaign-ad-preview-delete-200-response-inner-data
  {
   (ds/req :status) campaign-ad-preview-delete-200-response-inner-status-spec
   })

(def campaign-ad-preview-delete-200-response-inner-spec
  (ds/spec
    {:name ::campaign-ad-preview-delete-200-response-inner
     :spec campaign-ad-preview-delete-200-response-inner-data}))
