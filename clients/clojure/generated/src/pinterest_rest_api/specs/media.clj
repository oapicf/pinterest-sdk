(ns pinterest-rest-api.specs.media
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.media-upload-type :refer :all]
            [pinterest-rest-api.specs.media-upload-status :refer :all]
            )
  (:import (java.io File)))


(def media-data
  {
   (ds/req :media_id) string?
   (ds/req :media_type) media-upload-type-spec
   (ds/opt :status) media-upload-status-spec
   })

(def media-spec
  (ds/spec
    {:name ::media
     :spec media-data}))
