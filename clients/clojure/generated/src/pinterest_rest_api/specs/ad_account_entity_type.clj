(ns pinterest-rest-api.specs.ad-account-entity-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-account-entity-type-data
  {
   })

(def ad-account-entity-type-spec
  (ds/spec
    {:name ::ad-account-entity-type
     :spec ad-account-entity-type-data}))
