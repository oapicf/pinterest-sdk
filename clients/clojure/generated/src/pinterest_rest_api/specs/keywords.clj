(ns pinterest-rest-api.specs.keywords
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.keyword-error :refer :all]
            [pinterest-rest-api.specs.keyword :refer :all]
            )
  (:import (java.io File)))


(def keywords-data
  {
   (ds/req :errors) (s/coll-of keyword-error-spec)
   (ds/req :keywords) (s/coll-of keyword-spec)
   })

(def keywords-spec
  (ds/spec
    {:name ::keywords
     :spec keywords-data}))
