(ns pinterest-rest-api.specs.business-role-check-mode
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def business-role-check-mode-data
  {
   })

(def business-role-check-mode-spec
  (ds/spec
    {:name ::business-role-check-mode
     :spec business-role-check-mode-data}))
