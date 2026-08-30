(ns pinterest-rest-api.specs.collections-header-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def collections-header-type-data
  {
   })

(def collections-header-type-spec
  (ds/spec
    {:name ::collections-header-type
     :spec collections-header-type-data}))
