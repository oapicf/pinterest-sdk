(ns pinterest-rest-api.specs.campaign-ad-preview-create-200-response-inner
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.campaign-ad-preview-create-200-response-inner-data :refer :all]
            )
  (:import (java.io File)))


(def campaign-ad-preview-create-200-response-inner-data
  {
   (ds/req :data) campaign-ad-preview-create-200-response-inner-data-spec
   })

(def campaign-ad-preview-create-200-response-inner-spec
  (ds/spec
    {:name ::campaign-ad-preview-create-200-response-inner
     :spec campaign-ad-preview-create-200-response-inner-data}))
