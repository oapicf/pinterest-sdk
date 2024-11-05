(ns pinterest-rest-api.specs.audience-account-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audience-account-type-data
  {
   })

(def audience-account-type-spec
  (ds/spec
    {:name ::audience-account-type
     :spec audience-account-type-data}))
