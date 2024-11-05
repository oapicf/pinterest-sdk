(ns pinterest-rest-api.specs.audience-data-party
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audience-data-party-data
  {
   })

(def audience-data-party-spec
  (ds/spec
    {:name ::audience-data-party
     :spec audience-data-party-data}))
