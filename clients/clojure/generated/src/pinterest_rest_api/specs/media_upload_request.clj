(ns pinterest-rest-api.specs.media-upload-request
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.media-upload-type :refer :all]
            )
  (:import (java.io File)))


(def media-upload-request-data
  {
   (ds/req :media_type) media-upload-type-spec
   })

(def media-upload-request-spec
  (ds/spec
    {:name ::media-upload-request
     :spec media-upload-request-data}))
