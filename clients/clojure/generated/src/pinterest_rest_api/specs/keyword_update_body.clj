(ns pinterest-rest-api.specs.keyword-update-body
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [pinterest-rest-api.specs.keyword-update :refer :all]
            )
  (:import (java.io File)))


(def keyword-update-body-data
  {
   (ds/req :keywords) (s/coll-of keyword-update-spec)
   })

(def keyword-update-body-spec
  (ds/spec
    {:name ::keyword-update-body
     :spec keyword-update-body-data}))
