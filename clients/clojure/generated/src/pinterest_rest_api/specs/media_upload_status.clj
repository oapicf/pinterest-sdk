(ns pinterest-rest-api.specs.media-upload-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def media-upload-status-data
  {
   })

(def media-upload-status-spec
  (ds/spec
    {:name ::media-upload-status
     :spec media-upload-status-data}))
