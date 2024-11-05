(ns pinterest-rest-api.specs.feeds-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-feed :refer :all]
            )
  (:import (java.io File)))


(def feeds-list-200-response-data
  {
   (ds/req :items) (s/coll-of catalogs-feed-spec)
   (ds/opt :bookmark) string?
   })

(def feeds-list-200-response-spec
  (ds/spec
    {:name ::feeds-list-200-response
     :spec feeds-list-200-response-data}))
