(ns pinterest-rest-api.specs.pin-media-source-pin-url
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def pin-media-source-pin-url-data
  {
   (ds/opt :is_affiliate_link) boolean?
   (ds/req :source_type) string?
   })

(def pin-media-source-pin-url-spec
  (ds/spec
    {:name ::pin-media-source-pin-url
     :spec pin-media-source-pin-url-data}))
