(ns pinterest-rest-api.specs.audiences-list-200-response
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.ad-accounts-audience :refer :all]
            )
  (:import (java.io File)))


(def audiences-list-200-response-data
  {
   (ds/opt :bookmark) string?
   (ds/req :items) (s/coll-of ad-accounts-audience-spec)
   })

(def audiences-list-200-response-spec
  (ds/spec
    {:name ::audiences-list-200-response
     :spec audiences-list-200-response-data}))
