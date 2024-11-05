(ns pinterest-rest-api.specs.ad-preview-create-from-image
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-preview-create-from-image-data
  {
   (ds/req :image_url) string?
   (ds/req :title) string?
   })

(def ad-preview-create-from-image-spec
  (ds/spec
    {:name ::ad-preview-create-from-image
     :spec ad-preview-create-from-image-data}))
