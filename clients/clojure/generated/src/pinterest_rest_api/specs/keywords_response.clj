(ns pinterest-rest-api.specs.keywords-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.keyword-error :refer :all]
            [pinterest-rest-api.specs.keyword :refer :all]
            )
  (:import (java.io File)))


(def keywords-response-data
  {
   (ds/opt :errors) (s/coll-of keyword-error-spec)
   (ds/opt :keywords) (s/coll-of keyword-spec)
   })

(def keywords-response-spec
  (ds/spec
    {:name ::keywords-response
     :spec keywords-response-data}))
