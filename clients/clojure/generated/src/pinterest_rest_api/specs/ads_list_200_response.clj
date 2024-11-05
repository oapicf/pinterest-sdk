(ns pinterest-rest-api.specs.ads-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ad-response :refer :all]
            )
  (:import (java.io File)))


(def ads-list-200-response-data
  {
   (ds/req :items) (s/coll-of ad-response-spec)
   (ds/opt :bookmark) string?
   })

(def ads-list-200-response-spec
  (ds/spec
    {:name ::ads-list-200-response
     :spec ads-list-200-response-data}))
