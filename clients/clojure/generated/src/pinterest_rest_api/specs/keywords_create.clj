(ns pinterest-rest-api.specs.keywords-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.keyword-create-item :refer :all]
            )
  (:import (java.io File)))


(def keywords-create-data
  {
   (ds/req :keywords) (s/coll-of keyword-create-item-spec)
   (ds/req :parent_id) string?
   })

(def keywords-create-spec
  (ds/spec
    {:name ::keywords-create
     :spec keywords-create-data}))
