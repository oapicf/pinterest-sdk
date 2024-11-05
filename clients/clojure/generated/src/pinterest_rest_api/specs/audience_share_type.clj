(ns pinterest-rest-api.specs.audience-share-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def audience-share-type-data
  {
   })

(def audience-share-type-spec
  (ds/spec
    {:name ::audience-share-type
     :spec audience-share-type-data}))
