(ns pinterest-rest-api.specs.keyword-create-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.match-type :refer :all]
            )
  (:import (java.io File)))


(def keyword-create-item-data
  {
   (ds/opt :bid) int?
   (ds/req :match_type) match-type-spec
   (ds/req :value) string?
   })

(def keyword-create-item-spec
  (ds/spec
    {:name ::keyword-create-item
     :spec keyword-create-item-data}))
