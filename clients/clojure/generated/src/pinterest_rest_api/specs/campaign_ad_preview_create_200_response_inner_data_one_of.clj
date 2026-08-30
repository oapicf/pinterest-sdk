(ns pinterest-rest-api.specs.campaign-ad-preview-create-200-response-inner-data-one-of
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.pinterest/lib/error :refer :all]
            )
  (:import (java.io File)))


(def campaign-ad-preview-create-200-response-inner-data-one-of-data
  {
   (ds/req :exceptions) pinterest/lib/error-spec
   })

(def campaign-ad-preview-create-200-response-inner-data-one-of-spec
  (ds/spec
    {:name ::campaign-ad-preview-create-200-response-inner-data-one-of
     :spec campaign-ad-preview-create-200-response-inner-data-one-of-data}))
