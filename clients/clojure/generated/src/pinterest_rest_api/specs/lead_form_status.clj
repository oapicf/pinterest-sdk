(ns pinterest-rest-api.specs.lead-form-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def lead-form-status-data
  {
   })

(def lead-form-status-spec
  (ds/spec
    {:name ::lead-form-status
     :spec lead-form-status-data}))
