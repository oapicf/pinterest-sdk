(ns pinterest-rest-api.specs.media-upload-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def media-upload-type-data
  {
   })

(def media-upload-type-spec
  (ds/spec
    {:name ::media-upload-type
     :spec media-upload-type-data}))
