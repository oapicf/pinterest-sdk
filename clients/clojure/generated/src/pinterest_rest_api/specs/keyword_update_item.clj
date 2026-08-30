(ns pinterest-rest-api.specs.keyword-update-item
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def keyword-update-item-data
  {
   (ds/opt :archived) boolean?
   (ds/opt :bid) int?
   (ds/req :id) string?
   })

(def keyword-update-item-spec
  (ds/spec
    {:name ::keyword-update-item
     :spec keyword-update-item-data}))
