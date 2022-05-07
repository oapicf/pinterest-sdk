(ns pinterest-rest-api.specs.action-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def action-type-data
  {
   })

(def action-type-spec
  (ds/spec
    {:name ::action-type
     :spec action-type-data}))
