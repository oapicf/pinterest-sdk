(ns pinterest-rest-api.specs.media-upload-details
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.media-upload-type :refer :all]
            [pinterest-rest-api.specs.media-upload-status :refer :all]
            )
  (:import (java.io File)))


(def media-upload-details-data
  {
   (ds/opt :media_id) string?
   (ds/opt :media_type) media-upload-type-spec
   (ds/opt :status) media-upload-status-spec
   })

(def media-upload-details-spec
  (ds/spec
    {:name ::media-upload-details
     :spec media-upload-details-data}))
