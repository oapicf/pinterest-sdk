(ns pinterest-rest-api.specs.business-access-error
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def business-access-error-data
  {
   (ds/req :code) int?
   (ds/req :message) string?
   })

(def business-access-error-spec
  (ds/spec
    {:name ::business-access-error
     :spec business-access-error-data}))
