(ns pinterest-rest-api.specs.keyword-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def keyword-update-data
  {
   (ds/req :id) string?
   (ds/opt :archived) boolean?
   (ds/opt :bid) int?
   })

(def keyword-update-spec
  (ds/spec
    {:name ::keyword-update
     :spec keyword-update-data}))
