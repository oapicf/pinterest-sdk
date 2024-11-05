(ns pinterest-rest-api.specs.ad-preview-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-preview-request-data
  {
   (ds/req :image_url) string?
   (ds/req :title) string?
   (ds/req :pin_id) string?
   })

(def ad-preview-request-spec
  (ds/spec
    {:name ::ad-preview-request
     :spec ad-preview-request-data}))
