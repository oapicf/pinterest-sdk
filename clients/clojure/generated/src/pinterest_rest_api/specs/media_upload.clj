(ns pinterest-rest-api.specs.media-upload
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.media-upload-type :refer :all]
            [pinterest-rest-api.specs.media-upload-parameters :refer :all]
            )
  (:import (java.io File)))


(def media-upload-data
  {
   (ds/req :media_id) string?
   (ds/req :media_type) media-upload-type-spec
   (ds/opt :upload_parameters) media-upload-parameters-spec
   (ds/opt :upload_url) string?
   })

(def media-upload-spec
  (ds/spec
    {:name ::media-upload
     :spec media-upload-data}))
