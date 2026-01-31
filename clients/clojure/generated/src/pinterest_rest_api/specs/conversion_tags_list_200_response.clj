(ns pinterest-rest-api.specs.conversion-tags-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.conversion-tag :refer :all]
            )
  (:import (java.io File)))


(def conversion-tags-list-200-response-data
  {
   (ds/req :items) (s/coll-of conversion-tag-spec)
   })

(def conversion-tags-list-200-response-spec
  (ds/spec
    {:name ::conversion-tags-list-200-response
     :spec conversion-tags-list-200-response-data}))
