(ns pinterest-rest-api.specs.keywords-get-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.keyword :refer :all]
            )
  (:import (java.io File)))


(def keywords-get-200-response-data
  {
   (ds/opt :bookmark) string?
   (ds/req :items) (s/coll-of keyword-spec)
   })

(def keywords-get-200-response-spec
  (ds/spec
    {:name ::keywords-get-200-response
     :spec keywords-get-200-response-data}))
