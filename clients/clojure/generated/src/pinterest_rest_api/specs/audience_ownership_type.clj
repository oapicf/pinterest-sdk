(ns pinterest-rest-api.specs.audience-ownership-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audience-ownership-type-data
  {
   })

(def audience-ownership-type-spec
  (ds/spec
    {:name ::audience-ownership-type
     :spec audience-ownership-type-data}))
