(ns pinterest-rest-api.specs.keyword
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.match-type :refer :all]
            )
  (:import (java.io File)))


(def keyword-data
  {
   (ds/opt :archived) boolean?
   (ds/opt :bid) int?
   (ds/req :id) string?
   (ds/req :match_type) match-type-spec
   (ds/req :parent_id) string?
   (ds/opt :parent_type) string?
   (ds/opt :type) string?
   (ds/req :value) string?
   })

(def keyword-spec
  (ds/spec
    {:name ::keyword
     :spec keyword-data}))
