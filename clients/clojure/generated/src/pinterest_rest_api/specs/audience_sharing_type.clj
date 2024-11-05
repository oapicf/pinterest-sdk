(ns pinterest-rest-api.specs.audience-sharing-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audience-sharing-type-data
  {
   })

(def audience-sharing-type-spec
  (ds/spec
    {:name ::audience-sharing-type
     :spec audience-sharing-type-data}))
