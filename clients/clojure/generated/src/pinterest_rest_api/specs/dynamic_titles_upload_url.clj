(ns pinterest-rest-api.specs.dynamic-titles-upload-url
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def dynamic-titles-upload-url-data
  {
   (ds/opt :existing_filename) string?
   (ds/req :request_id) string?
   (ds/req :upload_url) string?
   })

(def dynamic-titles-upload-url-spec
  (ds/spec
    {:name ::dynamic-titles-upload-url
     :spec dynamic-titles-upload-url-data}))
