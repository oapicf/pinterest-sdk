(ns pinterest-rest-api.specs.error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def error-data
  {
   (ds/req :code) int?
   (ds/req :message) string?
   })

(def error-spec
  (ds/spec
    {:name ::error
     :spec error-data}))
