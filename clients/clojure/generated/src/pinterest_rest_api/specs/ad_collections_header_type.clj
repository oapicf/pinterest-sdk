(ns pinterest-rest-api.specs.ad-collections-header-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def ad-collections-header-type-data
  {
   })

(def ad-collections-header-type-spec
  (ds/spec
    {:name ::ad-collections-header-type
     :spec ad-collections-header-type-data}))
