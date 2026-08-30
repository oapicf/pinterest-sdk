(ns pinterest-rest-api.specs.keywords-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.keyword-update-item :refer :all]
            )
  (:import (java.io File)))


(def keywords-update-data
  {
   (ds/opt :keywords) (s/coll-of keyword-update-item-spec)
   })

(def keywords-update-spec
  (ds/spec
    {:name ::keywords-update
     :spec keywords-update-data}))
