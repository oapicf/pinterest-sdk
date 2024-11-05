(ns pinterest-rest-api.specs.keyword
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.match-type-response :refer :all]
            )
  (:import (java.io File)))


(def keyword-data
  {
   (ds/opt :bid) int?
   (ds/req :match_type) match-type-response-spec
   (ds/req :value) string?
   (ds/opt :archived) boolean?
   (ds/opt :id) string?
   (ds/opt :parent_id) string?
   (ds/opt :parent_type) string?
   (ds/opt :type) string?
   })

(def keyword-spec
  (ds/spec
    {:name ::keyword
     :spec keyword-data}))
