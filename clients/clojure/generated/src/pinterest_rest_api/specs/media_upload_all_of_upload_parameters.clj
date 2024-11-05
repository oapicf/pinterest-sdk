(ns pinterest-rest-api.specs.media-upload-all-of-upload-parameters
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def media-upload-all-of-upload-parameters-data
  {
   (ds/opt :x-amz-date) string?
   (ds/opt :x-amz-signature) string?
   (ds/opt :x-amz-security-token) string?
   (ds/opt :x-amz-algorithm) string?
   (ds/opt :key) string?
   (ds/opt :policy) string?
   (ds/opt :x-amz-credential) string?
   (ds/opt :Content-Type) string?
   })

(def media-upload-all-of-upload-parameters-spec
  (ds/spec
    {:name ::media-upload-all-of-upload-parameters
     :spec media-upload-all-of-upload-parameters-data}))
