(ns pinterest-rest-api.specs.partner-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def partner-type-data
  {
   })

(def partner-type-spec
  (ds/spec
    {:name ::partner-type
     :spec partner-type-data}))
