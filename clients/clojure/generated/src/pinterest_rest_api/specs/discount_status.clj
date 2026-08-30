(ns pinterest-rest-api.specs.discount-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def discount-status-data
  {
   })

(def discount-status-spec
  (ds/spec
    {:name ::discount-status
     :spec discount-status-data}))
