(ns pinterest-rest-api.specs.items-issues-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.catalogs-item-validation-issues :refer :all]
            )
  (:import (java.io File)))


(def items-issues-list-200-response-data
  {
   (ds/req :items) (s/coll-of catalogs-item-validation-issues-spec)
   (ds/opt :bookmark) string?
   })

(def items-issues-list-200-response-spec
  (ds/spec
    {:name ::items-issues-list-200-response
     :spec items-issues-list-200-response-data}))
