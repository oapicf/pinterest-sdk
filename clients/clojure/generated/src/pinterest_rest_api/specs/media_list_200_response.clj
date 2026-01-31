(ns pinterest-rest-api.specs.media-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.media :refer :all]
            )
  (:import (java.io File)))


(def media-list-200-response-data
  {
   (ds/opt :bookmark) string?
   (ds/req :items) (s/coll-of media-spec)
   })

(def media-list-200-response-spec
  (ds/spec
    {:name ::media-list-200-response
     :spec media-list-200-response-data}))
