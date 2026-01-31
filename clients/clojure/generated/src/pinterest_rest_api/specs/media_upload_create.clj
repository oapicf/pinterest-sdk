(ns pinterest-rest-api.specs.media-upload-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.media-upload-type :refer :all]
            )
  (:import (java.io File)))


(def media-upload-create-data
  {
   (ds/req :media_type) media-upload-type-spec
   })

(def media-upload-create-spec
  (ds/spec
    {:name ::media-upload-create
     :spec media-upload-create-data}))
