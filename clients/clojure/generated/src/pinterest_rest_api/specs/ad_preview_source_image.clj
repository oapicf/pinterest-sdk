(ns pinterest-rest-api.specs.ad-preview-source-image
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-preview-source-image-data
  {
   (ds/req :image_url) string?
   (ds/opt :promotion_id) string?
   (ds/req :title) string?
   })

(def ad-preview-source-image-spec
  (ds/spec
    {:name ::ad-preview-source-image
     :spec ad-preview-source-image-data}))
