(ns pinterest-rest-api.specs.image-base64
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def image-base64-data
  {
   (ds/req :content_type) string?
   (ds/req :data) string?
   })

(def image-base64-spec
  (ds/spec
    {:name ::image-base64
     :spec image-base64-data}))
