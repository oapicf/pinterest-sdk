(ns pinterest-rest-api.specs.keyword-update-generated
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def keyword-update-generated-data
  {
   (ds/opt :archived) boolean?
   (ds/opt :bid) int?
   (ds/req :id) string?
   })

(def keyword-update-generated-spec
  (ds/spec
    {:name ::keyword-update-generated
     :spec keyword-update-generated-data}))
