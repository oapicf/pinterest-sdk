(ns pinterest-rest-api.specs.media-upload
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.media-upload-type :refer :all]
            [pinterest-rest-api.specs.media-upload-all-of-upload-parameters :refer :all]
            )
  (:import (java.io File)))


(def media-upload-data
  {
   (ds/opt :media_id) string?
   (ds/opt :media_type) media-upload-type-spec
   (ds/opt :upload_url) string?
   (ds/opt :upload_parameters) media-upload-all-of-upload-parameters-spec
   })

(def media-upload-spec
  (ds/spec
    {:name ::media-upload
     :spec media-upload-data}))
