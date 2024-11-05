(ns pinterest-rest-api.specs.ad-preview-url-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-preview-url-response-data
  {
   (ds/opt :url) string?
   })

(def ad-preview-url-response-spec
  (ds/spec
    {:name ::ad-preview-url-response
     :spec ad-preview-url-response-data}))
