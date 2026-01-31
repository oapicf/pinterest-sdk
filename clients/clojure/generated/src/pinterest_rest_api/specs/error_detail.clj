(ns pinterest-rest-api.specs.error-detail
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def error-detail-data
  {
   (ds/req :count) int?
   (ds/req :error_code) int?
   (ds/req :message) string?
   })

(def error-detail-spec
  (ds/spec
    {:name ::error-detail
     :spec error-detail-data}))
